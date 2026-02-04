package tanstack.react.router

import js.objects.JsPlainObject
import tanstack.router.core.ParsedLocation

@JsPlainObject
internal external interface UseLocationOptions<T> {
    val select: Select<ParsedLocation, T>?
    val structuralSharing: Boolean?
}
