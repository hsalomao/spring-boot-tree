# Introduction -  spring-boot-tree

There is a tree defined with the following structure. Each node has a label, and optional left pointer and right pointer.

Write a function and any related code in Java that output node label in depth first traversal order (note: left before right).

{label: "A", left: "B", right: "D"}, {label: "B", left: "C", right: "E"}, {label: "C", left: "F"}, {label: "D"}, {label: "E"}, {label: "F"}

## Requirements

The project requires [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html) or
higher.

The project makes use of Apache Maven 3.6.3 (https://maven.apache.org/docs/3.6.3/release-notes.html) 

You just need to install Java 11 and Maven 3.6.3.

### Build the project

```console
$ ./mvn clean install
```

### Run the project

The application will start on port `8080`.
```console
$ ./mvn spring-boot:run
```

## API

Below is a list of the main API endpoints.

### List nodes

Endpoint

```text
GET /api/nodes
```

Example of request

/api/nodes

Response
{label:"A", left:"B", rigth:"D"}, {label:"B", left:"C", rigth:"E"}, {label:"C", left:"F"}, {label:"F"}, {label:"E"}, {label:"D"}

