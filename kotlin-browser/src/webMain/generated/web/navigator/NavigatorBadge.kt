// Automatically generated - do not modify!

package web.navigator

import js.core.UInt53
import js.core.Void
import js.promise.Promise
import js.promise.await
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 */
/* mixin */
@JsExternalInheritorsOnly
external interface NavigatorBadge {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge)
     */
    @JsName("clearAppBadge")
    fun clearAppBadgeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
     */
    @JsName("setAppBadge")
    fun setAppBadgeAsync(contents: UInt53 = definedExternally): Promise<Void>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge)
 */
suspend inline fun NavigatorBadge.clearAppBadge() {
    clearAppBadgeAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
 */
suspend inline fun NavigatorBadge.setAppBadge(contents: UInt53) {
    setAppBadgeAsync(
        contents = contents,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
 */
suspend inline fun NavigatorBadge.setAppBadge() {
    setAppBadgeAsync().await()
}
