// Automatically generated - do not modify!

package web.push

import js.core.JsString
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import web.time.EpochTimeStamp

@JsPlainObject
external interface PushSubscriptionJSON {
    val endpoint: String?
    val expirationTime: EpochTimeStamp?
    val keys: ReadonlyRecord<JsString, JsString>?
}
