// Automatically generated - do not modify!

@file:JsModule("react-router")
@file:JsNonModule

package react.router

import js.core.ReadonlyArray

/**
 * Matches the given routes to a location and returns the match data.
 *
 * @see https://reactrouter.com/docs/en/v6/api#matchroutes
 */
external fun matchRoutes(
    routes: ReadonlyArray<RouteObject>,
    locationArg: history.Location,
    basename: String = definedExternally,
): ReadonlyArray<RouteMatch>?
