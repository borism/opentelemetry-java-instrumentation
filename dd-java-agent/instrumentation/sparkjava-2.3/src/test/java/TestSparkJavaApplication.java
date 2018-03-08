import spark.Spark;

public class TestSparkJavaApplication {

  public static void main(final String[] args) {

    Spark.get("/", (req, res) -> "Hello World");

    Spark.get("/param/:param", (req, res) -> "Hello " + req.params("param"));

    Spark.get(
        "/exception/:param",
        (req, res) -> {
          throw new RuntimeException(req.params("param"));
        });
  }
}
