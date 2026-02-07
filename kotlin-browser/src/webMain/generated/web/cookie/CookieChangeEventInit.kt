// Automatically generated - do not modify!

package web.cookie

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieChangeEvent/CookieChangeEvent#options)
 */
@JsPlainObject
external interface CookieChangeEventInit :
    EventInit {
    var changed: CookieList?
    var deleted: CookieList?
}
