Small demo project to showcase a "clean" Spring architecture

Sample application taken from a [Spring tutorial](https://spring.io/guides/gs/rest-service/)

# Run

* `mvn clean spring-boot:run`
* Open `http://localhost:8080/greeting`

# Formatter

* Run with `mvn spotless:apply` to apply formatting (or from your IDE)
* Run with `mvn install` or `mvn verify` to check formatting (it will fail if it's incorrect)
* There's also an IntelliJ plugin for Prettier, but I haven't tried it.

We can configure it to apply formatting on commit using a commit hook.

# Enforce architecture

This project uses both Checkstyle and ArchUnit.

We can use Checkstyle to do quick 'n dirty checking for imports: is something from a certain package imported in a class where that isn't allowed? Run `mvn checkstyle:check` (or simply `mvn install` or `mvn verify`).

ArchUnit can do more advanced architectural checks, but at the cost of doing a lot of reflection (which slows down the tests a lot). See `ArchitectureTest.java` for an example.
