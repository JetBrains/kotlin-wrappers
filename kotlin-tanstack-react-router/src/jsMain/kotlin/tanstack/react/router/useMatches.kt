@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Read and select the current matched routes with type-safety.
 *
 * Options:
 * - `select`: Map the search object to a derived value for render optimization
 * - `structuralSharing`: Enable structural sharing for stable references
 *
 * [API Docs](https://tanstack.com/router/latest/docs/api/router/useMatchesHook)
 *
 * @return The array of route matches (or selected value) for the matched routes.
 */
internal /* raw */
external fun <T> useMatches(
    options: UseMatchesOptions<T>,
): T
