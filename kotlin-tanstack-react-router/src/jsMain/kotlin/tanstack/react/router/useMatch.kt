@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Read and select the current matched route with type-safety.
 *
 * Options:
 * - `from`/`strict`: Control which route's search is read and how strictly it's typed
 * - `select`: Map the search object to a derived value for render optimization
 * - `structuralSharing`: Enable structural sharing for stable references
 * - `shouldThrow`: Throw when the route is not found (strict contexts)
 *
 * [API Docs](https://tanstack.com/router/latest/docs/api/router/useMatchHook)
 *
 * @return The route match object (or selected value) for the matched route.
 */
internal /* raw */
external fun <T> useMatch(
    options: UseMatchOptions<T>,
): T
