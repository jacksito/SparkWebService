/**
 * Created by jack_ on 22/11/2015.
 */

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        // Java 8
        get("/hello", (req, res) -> "Hello World");

        get("/user", "application/json", (request, response) -> {
            return new User("Username", "1234556");
        }, new JsonTransformer());

       /*
        // Use it for Java 7
        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });*/


    }
}
