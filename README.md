# Exercise: caching

To reproduce the problem that you need to solve in this exercise, first start the
application in your IDE or in the command-line. For instance:

```
$ mvn spring-boot:run
```

Next use your web browser or any tool to access the `countries` endpoint:

```
$ curl http://localhost:8080/countries/FR
{"code":"FR"}
```

That request is very slow. Let's try to fix that.