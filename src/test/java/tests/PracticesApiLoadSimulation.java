package tests;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpDsl;
import io.gatling.javaapi.http.HttpProtocolBuilder;
import scenarios.Scenario;

public class PracticesApiLoadSimulation extends Simulation {
    HttpProtocolBuilder httpProtocolBuilder = HttpDsl.http
            .baseUrl("https://my.itmo.ru")
            .acceptHeader("application/json")
            .contentTypeHeader("application/json");


    //  Настройка нагрузки
    {
        setUp(
                Scenario.getScenario.injectOpen(
                        CoreDsl.constantUsersPerSec(20) // кол-во пользователей
                                .during(10) // продолжительность
                )
        ).protocols(httpProtocolBuilder);
    }
}
