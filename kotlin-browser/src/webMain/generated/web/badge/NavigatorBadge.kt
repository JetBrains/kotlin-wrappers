// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.badge

import js.core.UInt53
import js.core.Void
import js.internal.InternalApi
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 */
/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface NavigatorBadge {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge)
     */
    @JsName("clearAppBadge")
    fun clearAppBadgeAsync(): Promise<Void> = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
     */
    @JsName("setAppBadge")
    fun setAppBadgeAsync(contents: UInt53 = definedExternally): Promise<Void> = definedExternally
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
suspend inline fun NavigatorBadge.setAppBadge() {
    setAppBadgeAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge)
 */
suspend inline fun NavigatorBadge.setAppBadge(contents: UInt53) {
    setAppBadgeAsync(
        contents = contents,
    ).await()
}
