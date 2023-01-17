@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Matches the given routes to a location and returns the match data.
 *
 * @see https://reactrouter.com/docs/en/v6/utils/match-routes
 */
external fun <RouteObjectType : AgnosticRouteObject /* default is AgnosticRouteObject */> matchRoutes(
    routes: Array<RouteObjectType>,
    locationArg: Location,
    basename: String = definedExternally
): Array<AgnosticRouteMatch<RouteObjectType>>?

external fun <RouteObjectType : AgnosticRouteObject /* default is AgnosticRouteObject */> matchRoutes(
    routes: Array<RouteObjectType>,
    locationArg: String,
    basename: String = definedExternally
): Array<AgnosticRouteMatch<RouteObjectType>>?
