@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Access the current route's path parameters with type-safety.
 *
 * Options:
 * - `from`/`strict`: Specify the matched route and whether to enforce strict typing
 * - `select`: Project the params object to a derived value for memoized renders
 * - `structuralSharing`: Enable structural sharing for stable references
 * - `shouldThrow`: Throw if the route is not found in strict contexts
 *
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/useParamsHook)
 *
 * @return The params object (or selected value) for the matched route.
 */
internal /* raw */
external fun <T> useParams(
    options: UseParamsOptions<T>,
): T
