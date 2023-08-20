Create a Maven project with the previous Vending Machine and implement exceptions and logging to console and a file.

1. Use Maven to create a new project
2. Port your VendingMachine code over
3. Create a custom unchecked exception for InsufficientPaymentException
4. Add slf4j and logback and

```
  <dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>1.7.36</version>
  </dependency>
    <dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.12</version>
  </dependency>
```

1.  Do an INFO log when
    1. Application started
    2. User inserts payment
    3. User selects drink
2.  Do an ERROR log when user inserts insufficient payment.
3.  Catch the exception in the main method
4.  Logging should be done to console and a file.

You may need to set the JDK version in pom.xml if you are using Record and switch expression.

```
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <maven.compiler.release>17</maven.compiler.release>
  </properties>
```
