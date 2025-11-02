// Automatically generated - do not modify!

package web.cookie

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * The **`CookieStoreManager`** interface of the Cookie Store API allows service workers to subscribe to cookie change events. Call subscribe() on a particular service worker registration to receive change events.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager)
 */
open external class CookieStoreManager
private constructor() {
    /**
     * The **`getSubscriptions()`** method of the CookieStoreManager interface returns a list of all the cookie change subscriptions for this ServiceWorkerRegistration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/getSubscriptions)
     */
    @JsName("getSubscriptions")
    fun getSubscriptionsAsync(): Promise<ReadonlyArray<CookieStoreGetOptions>>

    /**
     * The **`subscribe()`** method of the CookieStoreManager interface subscribes a ServiceWorkerRegistration to cookie change events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/subscribe)
     */
    @JsName("subscribe")
    fun subscribeAsync(subscriptions: ReadonlyArray<CookieStoreGetOptions>): Promise<Void>

    /**
     * The **`unsubscribe()`** method of the CookieStoreManager interface stops the ServiceWorkerRegistration from receiving previously subscribed events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/unsubscribe)
     */
    @JsName("unsubscribe")
    fun unsubscribeAsync(subscriptions: ReadonlyArray<CookieStoreGetOptions>): Promise<Void>
}

/**
 * The **`getSubscriptions()`** method of the CookieStoreManager interface returns a list of all the cookie change subscriptions for this ServiceWorkerRegistration.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/getSubscriptions)
 */
suspend inline fun CookieStoreManager.getSubscriptions(): ReadonlyArray<CookieStoreGetOptions> {
    return getSubscriptionsAsync().await()
}

/**
 * The **`subscribe()`** method of the CookieStoreManager interface subscribes a ServiceWorkerRegistration to cookie change events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/subscribe)
 */
suspend inline fun CookieStoreManager.subscribe(subscriptions: ReadonlyArray<CookieStoreGetOptions>) {
    subscribeAsync(
        subscriptions = subscriptions,
    ).await()
}

/**
 * The **`unsubscribe()`** method of the CookieStoreManager interface stops the ServiceWorkerRegistration from receiving previously subscribed events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieStoreManager/unsubscribe)
 */
suspend inline fun CookieStoreManager.unsubscribe(subscriptions: ReadonlyArray<CookieStoreGetOptions>) {
    unsubscribeAsync(
        subscriptions = subscriptions,
    ).await()
}
