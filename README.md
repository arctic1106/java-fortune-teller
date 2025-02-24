# Java Fortune Teller
This project is a Java-based fortune teller application.

## Prerequisites:
- GraalVM installed and configured


## Running in JVM:
```sh
mvn package exec:java
```


## Generate metadata with agent and build native executable:
```sh
mvn -Pnative package
```


## Run the native executable (Example for windows executable):
```sh
./target/fortune.exe
```


## GraalVM related documentation:
https://www.graalvm.org/latest/reference-manual/native-image/guides/use-reachability-metadata-repository-maven/