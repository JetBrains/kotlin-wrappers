package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.LoaderData
import tanstack.router.core.RouteId

@JsPlainObject
internal external interface UseLoaderDataOptions<T> {
    val from: RouteId? /* RoutePath */
    val strict: Boolean?
    val select: Select<LoaderData?, T>?
    val structuralSharing: Boolean?
}
