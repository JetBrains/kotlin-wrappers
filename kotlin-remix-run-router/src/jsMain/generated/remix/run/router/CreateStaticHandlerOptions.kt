package remix.run.router


sealed external interface CreateStaticHandlerOptions {
    var basename: String?

    /**
     * @deprecated Use `mapRouteProperties` instead
     */
    var detectErrorBoundary: DetectErrorBoundaryFunction?
    var mapRouteProperties: MapRoutePropertiesFunction?
}
