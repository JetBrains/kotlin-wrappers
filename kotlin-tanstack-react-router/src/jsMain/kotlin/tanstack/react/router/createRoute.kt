@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Creates a non-root Route instance for code-based routing.
 *
 * Use this to define a route that will be composed into a route tree
 * (typically via a parent route's `addChildren`). If you're using file-based
 * routing, prefer `createFileRoute`.
 *
 * [Online Documentation](https://tanstack.com/router/latest/docs/framework/react/api/router/createRouteFunction)
 *
 * @param options Route options (path, component, loader, context, etc.).
 * @return A Route instance to be attached to the route tree.
 */
external fun createRoute(
    options: RouteOptions,
): Route
