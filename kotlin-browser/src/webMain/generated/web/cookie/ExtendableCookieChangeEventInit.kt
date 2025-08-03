// Automatically generated - do not modify!

package web.cookie

import js.objects.JsPlainObject
import web.serviceworker.ExtendableEventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableCookieChangeEvent/ExtendableCookieChangeEvent#options)
 */
@JsPlainObject
external interface ExtendableCookieChangeEventInit :
    ExtendableEventInit {
    var changed: CookieList?
    var deleted: CookieList?
}
