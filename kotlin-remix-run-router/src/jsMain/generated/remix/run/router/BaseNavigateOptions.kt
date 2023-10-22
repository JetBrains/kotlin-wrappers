package remix.run.router


sealed external interface BaseNavigateOptions : BaseNavigateOrFetchOptions {
    var replace: Boolean?
    var state: Any?
    var fromRouteId: String?
    var unstable_viewTransition: Boolean?
}
