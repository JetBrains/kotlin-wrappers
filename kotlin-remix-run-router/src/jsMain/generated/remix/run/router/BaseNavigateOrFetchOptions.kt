package remix.run.router


sealed external interface BaseNavigateOrFetchOptions {
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
}
