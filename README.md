## Simple example vert.x groovy is working on Java 9


```
jdk-9.0.4/bin/java -jar target/vertx-groovy-fat.jar 
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by io.netty.util.internal.ReflectionUtil (file:/home/vostapets/workspace/mockup/simple/vertx-groovy/target/vertx-groovy-fat.jar) to constructor java.nio.DirectByteBuffer(long,int)
WARNING: Please consider reporting this to the maintainers of io.netty.util.internal.ReflectionUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Feb 13, 2018 2:04:33 PM io.vertx.core.impl.launcher.commands.VertxIsolatedDeployer
INFO: Succeeded in deploying verticle

```


## Result
[http://localhost:8080/](http://localhost:8080/)

<html><body><h1>Hello world!!!</h1></body></html>