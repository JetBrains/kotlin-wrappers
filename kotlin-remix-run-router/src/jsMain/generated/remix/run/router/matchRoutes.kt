@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * Matches the given routes to a location and returns the match data.
 *
 * @see https://reactrouter.com/utils/match-routes
 */
external fun <RouteObjectType : AgnosticRouteObject /* default is AgnosticRouteObject */> matchRoutes(
    routes: js.core.ReadonlyArray<RouteObjectType>,
    locationArg: Location,
    basename: String = definedExternally
): js.core.ReadonlyArray<AgnosticRouteMatch<RouteObjectType>>?

external fun <RouteObjectType : AgnosticRouteObject /* default is AgnosticRouteObject */> matchRoutes(
    routes: js.core.ReadonlyArray<RouteObjectType>,
    locationArg: String,
    basename: String = definedExternally
): js.core.ReadonlyArray<AgnosticRouteMatch<RouteObjectType>>?
