@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * A route object represents a logical route, with (optionally) its child
 * routes organized in a tree-like structure.
 */
typealias AgnosticRouteObject = Any /* AgnosticIndexRouteObject | AgnosticNonIndexRouteObject */
