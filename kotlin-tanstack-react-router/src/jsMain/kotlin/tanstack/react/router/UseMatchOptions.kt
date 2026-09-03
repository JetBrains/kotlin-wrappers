package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.RouteId

@JsPlainObject
internal /* raw */
external interface UseMatchOptions<T> {
    val from: RouteId? /* RoutePath */
    val strict: Boolean?
    val select: Select<UseMatchResult, T>?
    val structuralSharing: Boolean?
    val shouldThrow: Boolean?
}
