@file:JsModule("@tanstack/react-router")

package tanstack.react.router

/**
 * Read and select the current route's loader data with type‑safety.
 *
 * Options:
 * - `from`/`strict`: Choose which route's data to read and strictness
 * - `select`: Map the loader data to a derived value
 * - `structuralSharing`: Enable structural sharing for stable references
 *
 * [API Docs](https://tanstack.com/router/latest/docs/framework/react/api/router/useLoaderDataHook)
 *
 * @returns The loader data (or selected value) for the matched route.
 */
internal /* raw */
external fun <T> useLoaderData(
    options: UseLoaderDataOptions<T>,
): T
