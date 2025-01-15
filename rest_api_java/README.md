# Spring boot java Rest API
## config
In the /com.test_keycloack_rest_api_java/src/main/resources/application.properties 
modify the variables according tou your keycloak config :
```properties
keycloak.port=8080
keycloak.realm=yourrealmname
spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:${keycloak.port}/realms/${keycloak.realm}
spring.security.oauth2.resourceserver.jwt.jwk-set-uri=${spring.security.oauth2.resourceserver.jwt.issuer-uri}/protocol/openid-connect/certs
server.port=8081

jwt.auth.converter.resource-id=yourKeycloakclientID
jwt.auth.converter.principle-attribute=preferred_username
```

In the /com.test_keycloack_rest_api_java/src/main/java/com/local_test/keycloack/DemoController.java
modify the variables according tou your keycloak config for the desired roles :
```java
@RestController
@RequestMapping("/api/v1/hello")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('role_desiered_A')")
    public String hello() {
        return "hello from spring boot ans keycloak - you are recognised as a role_desiered_A";
    }

    @GetMapping("/hello-2")
    @PreAuthorize("hasRole('role_desiered_B')") //role defined in the keycloak installation.
    public String hello2() {
        return "hello from spring boot ans keycloak - you are recognised as a role_desiered_B";
    }
}

```

## Oppen com.test_keycloack_rest_api_java/ in intelij and lunch it in normal or debug mode