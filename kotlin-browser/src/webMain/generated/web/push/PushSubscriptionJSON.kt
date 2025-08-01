// Automatically generated - do not modify!

package web.push

import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import web.time.EpochTimeStamp

@JsPlainObject
external interface PushSubscriptionJSON {
    var endpoint: String?
    var expirationTime: EpochTimeStamp?
    var keys: ReadonlyRecord<JsString, JsString>?
}
