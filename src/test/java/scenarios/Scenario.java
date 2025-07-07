package scenarios;

import io.gatling.javaapi.core.CoreDsl;
import io.gatling.javaapi.core.ScenarioBuilder;
import steps.Steps;

/**
 Определяет последовательность выполнения шагов
 */
public class Scenario {
    public static ScenarioBuilder getScenario = CoreDsl.scenario("Проверка сервиса 'Практики'")
            .exec(Steps.builder);
}
