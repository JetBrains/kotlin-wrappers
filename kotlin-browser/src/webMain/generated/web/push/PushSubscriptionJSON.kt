// Automatically generated - do not modify!

package web.push

import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import web.time.EpochTimeStamp
import kotlin.js.JsString

@JsPlainObject
external interface PushSubscriptionJSON {
    var endpoint: String?
    var expirationTime: EpochTimeStamp?
    var keys: ReadonlyRecord<JsString, JsString>?
}
