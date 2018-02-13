vertx.createHttpServer().requestHandler({ req ->
    def service = new SimpleService()
    def hello = service.hello()
    req.response().putHeader("content-type", "text/html").end("<html><body><h1>" + hello + "</h1></body></html>")
}).listen(8080)
