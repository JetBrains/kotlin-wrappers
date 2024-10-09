// Automatically generated - do not modify!

package web.push

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.time.EpochTimeStamp

@JsPlainObject
external interface PushSubscriptionJSON {
    val endpoint: String?
    val expirationTime: EpochTimeStamp?
    val keys: ReadonlyRecord<String, String>?
}
