@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Index routes must not have children
 */

sealed external interface AgnosticIndexRouteObject : AgnosticBaseRouteObject {
    var children: Nothing?
    var index: Boolean
}
