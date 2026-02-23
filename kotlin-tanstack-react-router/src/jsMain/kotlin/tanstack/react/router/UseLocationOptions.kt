package tanstack.react.router

import kotlinx.js.JsPlainObject
import tanstack.router.core.ParsedLocation

@JsPlainObject
internal /* raw */
external interface UseLocationOptions<T> {
    val select: Select<ParsedLocation, T>?
    val structuralSharing: Boolean?
}
