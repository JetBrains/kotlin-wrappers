@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Index routes must not have children
 */

external interface AgnosticIndexRouteObject : AgnosticBaseRouteObject {
    var children: Any? /* some expression */
    var index: Boolean
}

