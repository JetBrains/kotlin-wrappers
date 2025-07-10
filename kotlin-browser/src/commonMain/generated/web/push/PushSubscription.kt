// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.promise.Promise
import js.promise.await
import web.time.EpochTimeStamp
import kotlin.js.JsName

/**
 * The `PushSubscription` interface of the Push API provides a subscription's URL endpoint along with the public key and secrets that should be used for encrypting push messages to this subscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription)
 */
external class PushSubscription
private constructor() {
    /**
     * The **`endpoint`** read-only property of the the endpoint associated with the push subscription.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/endpoint)
     */
    val endpoint: String

    /**
     * The **`expirationTime`** read-only property of the of the subscription expiration time associated with the push subscription, if there is one, or `null` otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/expirationTime)
     */
    val expirationTime: EpochTimeStamp?

    /**
     * The **`options`** read-only property of the PushSubscription interface is an object containing the options used to create the subscription.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/options)
     */
    val options: PushSubscriptionOptions

    /**
     * The `getKey()` method of the PushSubscription interface returns an ArrayBuffer representing a client public key, which can then be sent to a server and used in encrypting push message data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/getKey)
     */
    fun getKey(name: PushEncryptionKeyName): ArrayBuffer?

    /**
     * The `toJSON()` method of the PushSubscription interface is a standard serializer: it returns a JSON representation of the subscription properties, providing a useful shortcut.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON)
     */
    fun toJSON(): PushSubscriptionJSON

    /**
     * The `unsubscribe()` method of the PushSubscription interface returns a Promise that resolves to a boolean value when the current subscription is successfully unsubscribed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/unsubscribe)
     */
    @JsName("unsubscribe")
    fun unsubscribeAsync(): Promise<JsBoolean>
}

/**
 * The `unsubscribe()` method of the PushSubscription interface returns a Promise that resolves to a boolean value when the current subscription is successfully unsubscribed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/unsubscribe)
 */
suspend inline fun PushSubscription.unsubscribe(): Boolean {
    return unsubscribeAsync().await().toBoolean()
}
