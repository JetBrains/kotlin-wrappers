// Automatically generated - do not modify!

package web.push

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.time.EpochTimeStamp

@JsPlainObject
sealed external interface PushSubscriptionJSON {
    var endpoint: String?
    var expirationTime: EpochTimeStamp?
    var keys: ReadonlyRecord<String, String>?
}
