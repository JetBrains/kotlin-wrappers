// Automatically generated - do not modify!

@file:JsModule("react-router")
@file:JsNonModule

package react.router

/**
 * Returns the element of the route that matched the current location, prepared
 * with the correct context to render the remainder of the route tree. Route
 * elements in the tree must render an <Outlet> to render their child route's
 * element.
 *
 * @see https://reactrouter.com/docs/en/v6/api#useroutes
 */
external fun useRoutes(
    routes: kotlinext.js.ReadonlyArray<RouteObject>,
    locationArg: history.Location = definedExternally,
): react.ReactElement
