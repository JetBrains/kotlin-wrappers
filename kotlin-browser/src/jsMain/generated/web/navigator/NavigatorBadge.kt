// Automatically generated - do not modify!

package web.navigator

import js.core.JsLong
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

/**
 * Available only in secure contexts.
 */
sealed external interface NavigatorBadge {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge)
     */
    @JsAsync
    suspend fun clearAppBadge()

    @JsName("clearAppBadge")
    fun clearAppBadgeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
     */
    @JsAsync
    suspend fun setAppBadge(contents: JsLong = definedExternally)

    @JsName("setAppBadge")
    fun setAppBadgeAsync(contents: JsLong = definedExternally): Promise<Void>
}
