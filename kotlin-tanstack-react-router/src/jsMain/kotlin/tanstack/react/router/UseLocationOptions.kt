package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.ParsedLocation

@JsPlainObject
external interface UseLocationOptions<T> {
    val select: (location: ParsedLocation) -> T
    val structuralSharing: Boolean?
}
