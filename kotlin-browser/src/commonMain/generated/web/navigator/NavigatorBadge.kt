// Automatically generated - do not modify!

package web.navigator

import js.core.UInt53
import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import seskar.js.JsAsync
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 */
sealed external interface NavigatorBadge {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge)
     */
    @JsName("clearAppBadge")
    fun clearAppBadgeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun setAppBadge(contents: UInt53 = definedExternally)

    @JsName("setAppBadge")
    fun setAppBadgeAsync(contents: UInt53 = definedExternally): Promise<Void>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge)
 */
suspend inline fun NavigatorBadge.clearAppBadge() {
    awaitPromiseLike(clearAppBadgeAsync())
}
