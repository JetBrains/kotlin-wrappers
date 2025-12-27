@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Creates a new Router instance for React.
 *
 * Pass the returned router to `RouterProvider` to enable routing.
 * Notable options: `routeTree` (your route definitions) and `context`
 * (required if the root route was created with `createRootRouteWithContext`).
 *
 * @param options Router options used to configure the router.
 * @returns A Router instance to be provided to `RouterProvider`.
 * [Online Documentation](https://tanstack.com/router/latest/docs/framework/react/api/router/createRouterFunction)
 */
external fun createRouter(
    options: RouterOptions,
): Router
