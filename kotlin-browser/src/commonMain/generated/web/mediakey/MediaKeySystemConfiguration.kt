// Automatically generated - do not modify!

package web.mediakey

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject

@JsPlainObject
external interface MediaKeySystemConfiguration {
    val audioCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
    val distinctiveIdentifier: MediaKeysRequirement?
    val initDataTypes: ReadonlyArray<JsString>?
    val label: String?
    val persistentState: MediaKeysRequirement?
    val sessionTypes: ReadonlyArray<JsString>?
    val videoCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
}
