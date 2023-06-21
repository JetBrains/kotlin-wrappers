// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.core.EpochTimeStamp
import kotlin.js.Promise

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
