package tanstack.react.router

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import tanstack.router.core.RouteMatch

@JsPlainObject
internal /* raw */
external interface UseMatchesOptions<T> {
    val select: Select<ReadonlyArray<RouteMatch>, T>?
    val structuralSharing: Boolean?
}
