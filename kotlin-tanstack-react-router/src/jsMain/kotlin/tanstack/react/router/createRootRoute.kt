@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Creates a root Route instance used to build your route tree.
 *
 * Typically paired with `createRouter({ routeTree })`. If you need to require
 * a typed router context, use `createRootRouteWithContext` instead.
 *
 * [Online Documentation](https://tanstack.com/router/latest/docs/framework/react/api/router/createRootRouteFunction)
 *
 * @param options Root route options (component, error, pending, etc.).
 * @return A root route instance.
 */
external fun createRootRoute(
    options: RootRouteOptions = definedExternally,
): RootRoute
