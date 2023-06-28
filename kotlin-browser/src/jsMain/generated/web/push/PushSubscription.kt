// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.core.EpochTimeStamp
import js.promise.Promise

/**
 * This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription)
 */
sealed external class PushSubscription {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/endpoint) */
    val endpoint: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/expirationTime) */
    val expirationTime: EpochTimeStamp?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/options) */
    val options: PushSubscriptionOptions

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/getKey) */
    fun getKey(name: PushEncryptionKeyName): ArrayBuffer?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/toJSON) */
    fun toJSON(): PushSubscriptionJSON

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushSubscription/unsubscribe) */
    fun unsubscribe(): Promise<Boolean>
}
