// Automatically generated - do not modify!

package web.media.capabilities

import js.array.ReadonlyArray
import js.core.JsString
import js.objects.JsPlainObject
import web.media.key.MediaKeysRequirement

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
