@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Non-index routes may have children, but cannot have index
 */

external interface AgnosticNonIndexRouteObject : AgnosticBaseRouteObject {
    var children: js.core.ReadonlyArray<AgnosticRouteObject>?
    var index: Boolean?
}

