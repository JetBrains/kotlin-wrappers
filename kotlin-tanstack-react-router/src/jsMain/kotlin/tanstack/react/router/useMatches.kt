@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import js.array.ReadonlyArray

/**
 * The useMatches hook returns the router's complete presented array of RouteMatch objects regardless of its caller's position in the component tree. The array can include still-loading descendants or matches below a pending/error/not-found render boundary.
 *
 * Options:
 * - `select`: If supplied, this function will be called with the route matches and the return value will be returned from useMatches. This value will also be used to determine if the hook should re-render its parent component using shallow equality checks.
 * - `structuralSharing`: Configures whether structural sharing is enabled for the value returned by select.
 *
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/useMatchesHook)
 *
 * @return An array of RouteMatch objects (or selected value) for the matched route.
 */
external fun useMatches(): ReadonlyArray<RouteMatch>

internal /* raw */
external fun <T> useMatches(
    options: UseMatchesOptions<T>,
): T
