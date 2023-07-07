package remix.run.router


/**
 * Non-index routes may have children, but cannot have index
 */

sealed external interface AgnosticNonIndexRouteObject : AgnosticBaseRouteObject {
    var children: js.core.ReadonlyArray<AgnosticRouteObject>?
    var index: Boolean?
}
