package io.digitalstate.stix.faker;

import io.digitalstate.stix.faker.configs.ObservedDataGeneratorConfig;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

import java.util.Optional;

public class GeneratorVerticle extends AbstractVerticle {

    private StixMockDataGenerator generator = new StixMockDataGenerator();

    @Override
    public void start() throws Exception {

        HttpServer server = vertx.createHttpServer(new HttpServerOptions());
        Router router = Router.router(vertx);

        router.route().handler(BodyHandler.create());

        router.route(HttpMethod.GET, "/api/sdo/attack-pattern").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockAttackPattern().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/campaign").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockCampaign().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/course-of-action").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockCourseOfAction().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/identity").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockIdentity().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/indicator").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockIndicator().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/intrusion-set").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockIntrusionSet().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/malware").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockMalware().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/observed-data")
                .handler(routingContext -> {
                    HttpServerResponse response = routingContext.response();
                    response.putHeader("content-type", "application/json");

                    if (routingContext.getBody().length() > 0){
                        ObservedDataGeneratorConfig genConfig = routingContext.getBodyAsJson().mapTo(ObservedDataGeneratorConfig.class);
                        response.end(generator.mockObservedData(genConfig).toJsonString());

                    } else {
                        response.end(generator.mockObservedData().toJsonString());
                    }
                });

        router.route(HttpMethod.GET, "/api/sdo/report").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockReport().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/threat-actor").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockThreatActor().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/tool").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockTool().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sdo/vulnerability").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockVulnerability().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sro/relationship").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockRelationship().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/sro/sighting").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockSighting().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/data-marking/marking-definition").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockMarkingDefinition().toJsonString());
        });

        router.route(HttpMethod.GET, "/api/bundle").handler(routingContext -> {

            HttpServerResponse response = routingContext.response();
            response.putHeader("content-type", "application/json");

            response.end(generator.mockBundle().toJsonString());
        });

        int port = Optional.ofNullable(config().getInteger("port"))
                .orElse(8080);

        server.requestHandler(router).listen(port);
    }
}