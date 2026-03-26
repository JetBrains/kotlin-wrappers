package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.RouteId
import tanstack.router.core.RouteMatch

@JsPlainObject
external interface UseMatchOptions<T> {
    val from: RouteId? /* RoutePath */
    val strict: Boolean?
    val select: Select<RouteMatch, T>?
    val structuralSharing: Boolean?
    val shouldThrow: Boolean?
}
