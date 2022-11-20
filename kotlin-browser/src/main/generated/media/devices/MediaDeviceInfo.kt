// Automatically generated - do not modify!

package media.devices

sealed external class MediaDeviceInfo {
    val deviceId: String
    val groupId: String
    val kind: MediaDeviceKind
    val label: String
    fun toJSON(): Any
}
