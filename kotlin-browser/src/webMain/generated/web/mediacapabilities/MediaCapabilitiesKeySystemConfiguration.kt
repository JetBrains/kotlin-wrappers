// Automatically generated - do not modify!

package web.mediacapabilities

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.mediakey.MediaKeysRequirement
import kotlin.js.JsString

@JsPlainObject
external interface MediaCapabilitiesKeySystemConfiguration {
    var audio: KeySystemTrackConfiguration?
    var distinctiveIdentifier: MediaKeysRequirement?
    var initDataType: String?
    var keySystem: String
    var persistentState: MediaKeysRequirement?
    var sessionTypes: ReadonlyArray<JsString>?
    var video: KeySystemTrackConfiguration?
}
