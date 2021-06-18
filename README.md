Small demo project to showcase a "clean" Spring architecture

Sample application taken from a [Spring tutorial](https://spring.io/guides/gs/rest-service/)

Run as follows:
* `mvn clean spring-boot:run`
* Open `http://localhost:8080/greeting`

Formatter:
* Run with `mvn spotless:apply` to apply formatting (or from your IDE)
* Run with `mvn install` or `mvn verify` to check formatting (it will fail if it's incorrect)
* There's also an IntelliJ plugin for Prettier, but I haven't tried it.

We can configure it to apply formatting on commit using a commit hook.
