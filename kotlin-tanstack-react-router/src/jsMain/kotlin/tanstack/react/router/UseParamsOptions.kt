package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.Params
import tanstack.router.core.RouteId

@JsPlainObject
internal /* raw */
external interface UseParamsOptions<T> {
    val from: RouteId? /* RoutePath */
    val strict: Boolean?
    val select: Select<Params, T>?
    val structuralSharing: Boolean?
    val shouldThrow: Boolean?
}
