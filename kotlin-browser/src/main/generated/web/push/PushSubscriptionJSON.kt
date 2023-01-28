// Automatically generated - do not modify!

package web.push

import js.core.EpochTimeStamp
import js.core.ReadonlyRecord

sealed external interface PushSubscriptionJSON {
    var endpoint: String?
    var expirationTime: EpochTimeStamp?
    var keys: ReadonlyRecord<String, String>?
}
