// Automatically generated - do not modify!

package web.media.devices

sealed external class MediaDeviceInfo {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/deviceId) */
    val deviceId: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/groupId) */
    val groupId: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind) */
    val kind: MediaDeviceKind

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/label) */
    val label: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/toJSON) */
    fun toJSON(): Any
}
