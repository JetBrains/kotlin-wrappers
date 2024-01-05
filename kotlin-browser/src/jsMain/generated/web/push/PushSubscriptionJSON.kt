// Automatically generated - do not modify!

package web.push

import js.objects.ReadonlyRecord
import web.time.EpochTimeStamp

sealed external interface PushSubscriptionJSON {
    var endpoint: String?
    var expirationTime: EpochTimeStamp?
    var keys: ReadonlyRecord<String, String>?
}
