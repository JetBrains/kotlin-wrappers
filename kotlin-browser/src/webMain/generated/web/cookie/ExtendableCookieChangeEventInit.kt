// Automatically generated - do not modify!

package web.cookie

import kotlinx.js.JsPlainObject
import web.serviceworker.ExtendableEventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableCookieChangeEvent/ExtendableCookieChangeEvent#options)
 */
@JsPlainObject
external interface ExtendableCookieChangeEventInit :
    ExtendableEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableCookieChangeEvent/ExtendableCookieChangeEvent#changed)
     */
    var changed: CookieList?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableCookieChangeEvent/ExtendableCookieChangeEvent#deleted)
     */
    var deleted: CookieList?
}
