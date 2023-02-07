// Automatically generated - do not modify!

package web.push

import js.buffer.ArrayBuffer
import js.core.EpochTimeStamp
import kotlin.js.Promise

sealed external class PushSubscription {
    val endpoint: String
    val expirationTime: EpochTimeStamp?
    val options: PushSubscriptionOptions
    fun getKey(name: PushEncryptionKeyName): ArrayBuffer?
    fun toJSON(): PushSubscriptionJSON
    fun unsubscribe(): Promise<Boolean>
}
