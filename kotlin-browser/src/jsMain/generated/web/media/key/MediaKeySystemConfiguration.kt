// Automatically generated - do not modify!

package web.media.key

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MediaKeySystemConfiguration {
    var audioCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
    var distinctiveIdentifier: MediaKeysRequirement?
    var initDataTypes: ReadonlyArray<String>?
    var label: String?
    var persistentState: MediaKeysRequirement?
    var sessionTypes: ReadonlyArray<String>?
    var videoCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
}
