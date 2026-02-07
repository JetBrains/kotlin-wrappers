// Automatically generated - do not modify!

package web.mediakey

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import kotlin.js.JsString

@JsPlainObject
external interface MediaKeySystemConfiguration {
    var audioCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
    var distinctiveIdentifier: MediaKeysRequirement?
    var initDataTypes: ReadonlyArray<JsString>?
    var label: String?
    var persistentState: MediaKeysRequirement?
    var sessionTypes: ReadonlyArray<JsString>?
    var videoCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
}
