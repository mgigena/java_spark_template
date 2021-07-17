import static spark.Spark.get;
import static spark.Spark.port;

public class Main {

    /*
    for more visit https://www.baeldung.com/spark-framework-rest-api
     */
    public static void main(String[] args) {
        port(8080);
        get("/hello", (req, res)->"Hello, world");

        get("/hello/:name", (req,res)->{
            return "Hello, "+ req.params(":name");
        });
    }
}
