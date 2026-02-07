// Automatically generated - do not modify!

package web.push

import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject
import web.time.EpochTimeStamp
import kotlin.js.JsString

@JsPlainObject
external interface PushSubscriptionJSON {
    var endpoint: String?
    var expirationTime: EpochTimeStamp?
    var keys: ReadonlyRecord<JsString, JsString>?
}
