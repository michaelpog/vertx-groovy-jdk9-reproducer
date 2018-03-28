## Simple example vert.x groovy is working on Java 9


```
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/  mvn clean install

LA-MPOGREBINSKY-MPB15:vertx-groovy mpogrebinsky$ /Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home/bin/java -jar target/vertx-groovy-fat.jar
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by io.netty.util.internal.ReflectionUtil (file:/Users/mpogrebinsky/Development/vertx-groovy/target/vertx-groovy-fat.jar) to constructor java.nio.DirectByteBuffer(long,int)
WARNING: Please consider reporting this to the maintainers of io.netty.util.internal.ReflectionUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
java.lang.VerifyError: (class: io/vertx/core/Vertx$vertx, method: call signature: (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;) Illegal type in constant pool
        at java.base/java.lang.Class.getDeclaredConstructors0(Native Method)
        at java.base/java.lang.Class.privateGetDeclaredConstructors(Class.java:3110)
        at java.base/java.lang.Class.getConstructor0(Class.java:3315)
        at java.base/java.lang.Class.getConstructor(Class.java:2108)
        at org.codehaus.groovy.reflection.ClassLoaderForClassArtifacts.defineClassAndGetConstructor(ClassLoaderForClassArtifacts.java:82)
        at org.codehaus.groovy.runtime.callsite.CallSiteGenerator.compileStaticMethod(CallSiteGenerator.java:262)
        at org.codehaus.groovy.reflection.CachedMethod.createStaticMetaMethodSite(CachedMethod.java:295)
        at org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite.createStaticMetaMethodSite(StaticMetaMethodSite.java:114)
        at groovy.lang.MetaClassImpl.createStaticSite(MetaClassImpl.java:3421)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.createCallStaticSite(CallSiteArray.java:76)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.createCallSite(CallSiteArray.java:161)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)
        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)
        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:120)
        at MyGroovyVerticle.run(MyGroovyVerticle.groovy:6)
        at io.vertx.lang.groovy.ScriptVerticle.start(ScriptVerticle.java:64)
        at io.vertx.core.impl.DeploymentManager.lambda$doDeploy$10(DeploymentManager.java:481)
        at io.vertx.core.impl.ContextImpl.lambda$wrapTask$2(ContextImpl.java:344)
        at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:163)
        at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:403)
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:463)
        at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:858)
        at java.base/java.lang.Thread.run(Thread.java:844)
Mar 28, 2018 1:34:16 PM io.vertx.core.impl.launcher.commands.VertxIsolatedDeployer
SEVERE: Failed in deploying verticle
java.lang.VerifyError: (class: io/vertx/core/Vertx$vertx, method: call signature: (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;) Illegal type in constant pool
        at java.base/java.lang.Class.getDeclaredConstructors0(Native Method)
        at java.base/java.lang.Class.privateGetDeclaredConstructors(Class.java:3110)
        at java.base/java.lang.Class.getConstructor0(Class.java:3315)
        at java.base/java.lang.Class.getConstructor(Class.java:2108)
        at org.codehaus.groovy.reflection.ClassLoaderForClassArtifacts.defineClassAndGetConstructor(ClassLoaderForClassArtifacts.java:82)
        at org.codehaus.groovy.runtime.callsite.CallSiteGenerator.compileStaticMethod(CallSiteGenerator.java:262)
        at org.codehaus.groovy.reflection.CachedMethod.createStaticMetaMethodSite(CachedMethod.java:295)
        at org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite.createStaticMetaMethodSite(StaticMetaMethodSite.java:114)
        at groovy.lang.MetaClassImpl.createStaticSite(MetaClassImpl.java:3421)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.createCallStaticSite(CallSiteArray.java:76)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.createCallSite(CallSiteArray.java:161)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)
        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)
        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:120)
        at MyGroovyVerticle.run(MyGroovyVerticle.groovy:6)
        at io.vertx.lang.groovy.ScriptVerticle.start(ScriptVerticle.java:64)
        at io.vertx.core.impl.DeploymentManager.lambda$doDeploy$10(DeploymentManager.java:481)
        at io.vertx.core.impl.ContextImpl.lambda$wrapTask$2(ContextImpl.java:344)
        at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:163)
        at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:403)
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:463)
        at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:858)
        at java.base/java.lang.Thread.run(Thread.java:844)

java.lang.VerifyError: (class: io/vertx/core/Vertx$vertx, method: call signature: (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;) Illegal type in constant pool
        at java.base/java.lang.Class.getDeclaredConstructors0(Native Method)
        at java.base/java.lang.Class.privateGetDeclaredConstructors(Class.java:3110)
        at java.base/java.lang.Class.getConstructor0(Class.java:3315)
        at java.base/java.lang.Class.getConstructor(Class.java:2108)
        at org.codehaus.groovy.reflection.ClassLoaderForClassArtifacts.defineClassAndGetConstructor(ClassLoaderForClassArtifacts.java:82)
        at org.codehaus.groovy.runtime.callsite.CallSiteGenerator.compileStaticMethod(CallSiteGenerator.java:262)
        at org.codehaus.groovy.reflection.CachedMethod.createStaticMetaMethodSite(CachedMethod.java:295)
        at org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite.createStaticMetaMethodSite(StaticMetaMethodSite.java:114)
        at groovy.lang.MetaClassImpl.createStaticSite(MetaClassImpl.java:3421)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.createCallStaticSite(CallSiteArray.java:76)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.createCallSite(CallSiteArray.java:161)
        at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)
        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)
        at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:120)
        at MyGroovyVerticle.run(MyGroovyVerticle.groovy:6)
        at io.vertx.lang.groovy.ScriptVerticle.start(ScriptVerticle.java:64)
        at io.vertx.core.impl.DeploymentManager.lambda$doDeploy$10(DeploymentManager.java:481)
        at io.vertx.core.impl.ContextImpl.lambda$wrapTask$2(ContextImpl.java:344)
        at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:163)
        at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:403)
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:463)
        at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:858)
        at java.base/java.lang.Thread.run(Thread.java:844)

```
