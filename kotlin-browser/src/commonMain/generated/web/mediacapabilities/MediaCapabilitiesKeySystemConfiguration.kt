// Automatically generated - do not modify!

package web.mediacapabilities

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject
import web.mediakey.MediaKeysRequirement

@JsPlainObject
external interface MediaCapabilitiesKeySystemConfiguration {
    val audio: KeySystemTrackConfiguration?
    val distinctiveIdentifier: MediaKeysRequirement?
    val initDataType: String?
    val keySystem: String
    val persistentState: MediaKeysRequirement?
    val sessionTypes: ReadonlyArray<JsString>?
    val video: KeySystemTrackConfiguration?
}
