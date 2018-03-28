import io.vertx.core.ServiceHelper
import io.vertx.core.Vertx
import io.vertx.core.spi.VertxFactory


def vertx = Vertx.vertx()
vertx.createHttpServer().requestHandler({ req ->
    req.response().putHeader("content-type", "text/html").end("<html><body><h1>" + hello + "</h1></body></html>")
}).listen(8080)

System.out.println("hi")
Thread.sleep(1000)
