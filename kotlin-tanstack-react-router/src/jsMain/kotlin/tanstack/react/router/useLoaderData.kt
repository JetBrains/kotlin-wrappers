@file:JsModule("@tanstack/react-router")

package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.LoaderData
import tanstack.router.core.RouteId

@JsPlainObject
internal external interface UseLoaderDataOptions<T> {
    val from: RouteId? /* RoutePath */
    val strict: Boolean?
    val select: Select<LoaderData?, T>?
    val structuralSharing: Boolean?
}

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
internal external fun <T> useLoaderData(
    options: UseLoaderDataOptions<T>,
): T
