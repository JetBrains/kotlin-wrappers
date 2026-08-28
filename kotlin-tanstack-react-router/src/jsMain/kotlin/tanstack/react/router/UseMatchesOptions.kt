package tanstack.react.router

import kotlinx.js.JsPlainObject
import js.array.ReadonlyArray

@JsPlainObject
internal /* raw */
external interface UseMatchesOptions<T> {
    val select: Select<ReadonlyArray<RouteMatch>, T>?
    val structuralSharing: Boolean?
}
