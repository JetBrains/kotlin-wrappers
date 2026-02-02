package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.RouteId
import tanstack.router.core.Search

@JsPlainObject
internal external interface UseSearchOptions<T> {
    val from: RouteId? /* RoutePath */
    val strict: Boolean?
    val select: Select<Search, T>?
    val structuralSharing: Boolean?
    val shouldThrow: Boolean?
}
