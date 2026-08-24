// Automatically generated - do not modify!

package web.mediaencrypted

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#return_value)
 */
@JsPlainObject
external interface MediaKeySystemConfiguration {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#audiocapabilities)
     */
    var audioCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#distinctiveidentifier)
     */
    var distinctiveIdentifier: MediaKeysRequirement?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#initdatatypes)
     */
    var initDataTypes: ReadonlyArray<JsString>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#label)
     */
    var label: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#persistentstate)
     */
    var persistentState: MediaKeysRequirement?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#sessiontypes)
     */
    var sessionTypes: ReadonlyArray<JsString>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration#videocapabilities)
     */
    var videoCapabilities: ReadonlyArray<MediaKeySystemMediaCapability>?
}
