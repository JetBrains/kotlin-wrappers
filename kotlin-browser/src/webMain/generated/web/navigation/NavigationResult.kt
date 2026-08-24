// Automatically generated - do not modify!

package web.navigation

import js.promise.Promise
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/back#return_value)
 */
@JsPlainObject
external interface NavigationResult {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/back#committed)
     */
    var committed: Promise<NavigationHistoryEntry>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/back#finished)
     */
    var finished: Promise<NavigationHistoryEntry>?
}
