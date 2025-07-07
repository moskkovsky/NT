package steps;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.http.HttpDsl;

/**
  Содержит атомарные HTTP-действия
 */

public class Steps {
    public static ChainBuilder builder = CoreDsl.exec(
            HttpDsl.http("GET /practices - Получение списка практик")
                    .get("/practices")
                    .check(HttpDsl.status().is(200))
    );
}
