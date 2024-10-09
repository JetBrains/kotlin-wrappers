// Automatically generated - do not modify!

package web.media.key

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MediaKeySystemConfiguration {
    val audioCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
    val distinctiveIdentifier: MediaKeysRequirement?
    val initDataTypes: ReadonlyArray<String>?
    val label: String?
    val persistentState: MediaKeysRequirement?
    val sessionTypes: ReadonlyArray<String>?
    val videoCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
}
