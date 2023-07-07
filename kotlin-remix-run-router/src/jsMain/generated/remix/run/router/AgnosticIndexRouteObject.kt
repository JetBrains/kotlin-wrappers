package remix.run.router


/**
 * Index routes must not have children
 */

sealed external interface AgnosticIndexRouteObject : AgnosticBaseRouteObject {
    var children: Nothing?
    var index: Boolean
}
