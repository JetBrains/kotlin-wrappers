// Automatically generated - do not modify!

package web.mediakey

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject

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
