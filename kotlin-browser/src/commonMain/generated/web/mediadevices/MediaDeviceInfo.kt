// Automatically generated - do not modify!

package web.mediadevices

import js.core.JsAny

/**
 * The **`MediaDeviceInfo`** interface of the Media Capture and Streams API contains information that describes a single media input or output device.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo)
 */
open external class MediaDeviceInfo
private constructor() {
    /**
     * The **`deviceId`** read-only property of the MediaDeviceInfo interface returns a string that is an identifier for the represented device and is persisted across sessions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/deviceId)
     */
    val deviceId: String

    /**
     * The **`groupId`** read-only property of the MediaDeviceInfo interface returns a string that is a group identifier.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/groupId)
     */
    val groupId: String

    /**
     * The **`kind`** read-only property of the MediaDeviceInfo interface returns an enumerated value, that is either `'videoinput'`, `'audioinput'` or `'audiooutput'`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind)
     */
    val kind: MediaDeviceKind

    /**
     * The **`label`** read-only property of the MediaDeviceInfo interface returns a string describing this device (for example 'External USB Webcam').
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/label)
     */
    val label: String

    /**
     * The **`toJSON()`** method of the MediaDeviceInfo interface is a Serialization; it returns a JSON representation of the MediaDeviceInfo object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/toJSON)
     */
    fun toJSON(): JsAny
}
