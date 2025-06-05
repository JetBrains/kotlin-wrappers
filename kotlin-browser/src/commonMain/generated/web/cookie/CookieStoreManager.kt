// Automatically generated - do not modify!

package web.cookie

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * The **`CookieStoreManager`** interface of the Cookie Store API allows service workers to subscribe to cookie change events.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager)
 */
external class CookieStoreManager
private constructor() {
    /**
     * The **`getSubscriptions()`** method of the CookieStoreManager interface returns a list of all the cookie change subscriptions for this ServiceWorkerRegistration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/getSubscriptions)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun getSubscriptions(): ReadonlyArray<CookieStoreGetOptions>

    @JsName("getSubscriptions")
    fun getSubscriptionsAsync(): Promise<ReadonlyArray<CookieStoreGetOptions>>

    /**
     * The **`subscribe()`** method of the CookieStoreManager interface subscribes a ServiceWorkerRegistration to cookie change events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/subscribe)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun subscribe(subscriptions: ReadonlyArray<CookieStoreGetOptions>)

    @JsName("subscribe")
    fun subscribeAsync(subscriptions: ReadonlyArray<CookieStoreGetOptions>): Promise<Void>

    /**
     * The **`unsubscribe()`** method of the CookieStoreManager interface stops the ServiceWorkerRegistration from receiving previously subscribed events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/unsubscribe)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun unsubscribe(subscriptions: ReadonlyArray<CookieStoreGetOptions>)

    @JsName("unsubscribe")
    fun unsubscribeAsync(subscriptions: ReadonlyArray<CookieStoreGetOptions>): Promise<Void>
}
