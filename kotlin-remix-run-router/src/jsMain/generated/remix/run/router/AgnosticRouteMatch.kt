@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * A RouteMatch contains info about how a route matched a URL.
 */

external interface AgnosticRouteMatch<RouteObjectType : AgnosticRouteObject /* default is AgnosticRouteObject */> {
    /**
     * The names and values of dynamic parameters in the URL.
     */
    var params: Params

    /**
     * The portion of the URL pathname that was matched.
     */
    var pathname: String

    /**
     * The portion of the URL pathname that was matched before child routes.
     */
    var pathnameBase: String

    /**
     * The route object that was used to match.
     */
    var route: RouteObjectType
}

