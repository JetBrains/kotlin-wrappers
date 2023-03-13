package remix.run.router


sealed external interface StaticHandlerQueryRouteOpts {
    var routeId: String?
    var requestContext: Any?
}
