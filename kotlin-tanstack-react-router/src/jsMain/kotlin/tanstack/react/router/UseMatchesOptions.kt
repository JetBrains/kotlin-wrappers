package tanstack.react.router

import kotlinx.js.JsPlainObject

@JsPlainObject
internal /* raw */
external interface UseMatchesOptions<T> {
    val select: Select<Array<RouteMatch>, T>?
    val structuralSharing: Boolean?
}
