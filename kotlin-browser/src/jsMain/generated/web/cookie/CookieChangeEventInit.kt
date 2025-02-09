// Automatically generated - do not modify!

package web.cookie

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface CookieChangeEventInit :
    EventInit {
    val changed: CookieList?
    val deleted: CookieList?
}
