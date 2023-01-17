@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Initialization options for createRouter
 */

external interface RouterInit {
    var basename: String?
    var routes: Array<AgnosticRouteObject>
    var history: History
    var hydrationData: HydrationState?
}

