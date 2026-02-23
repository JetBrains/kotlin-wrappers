@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Access the current TanStack Router instance from React context.
 * Must be used within a `RouterProvider`.
 *
 * Options:
 * - `warn`: Log a warning if no router context is found (default: true).
 *
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/useRouterHook)
 *
 * @return The registered router instance.
 */
external fun useRouter(): Router

internal /* raw */
external fun useRouter(
    options: UseRouterOptions,
): Router
