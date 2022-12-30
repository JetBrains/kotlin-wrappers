// Automatically generated - do not modify!

package web.media.streams

import js.core.ReadonlyArray

sealed external interface MediaTrackCapabilities {
    var aspectRatio: DoubleRange?
    var autoGainControl: ReadonlyArray<Boolean>?
    var channelCount: ULongRange?
    var cursor: ReadonlyArray<String>?
    var deviceId: String?
    var displaySurface: String?
    var echoCancellation: ReadonlyArray<Boolean>?
    var facingMode: ReadonlyArray<String>?
    var frameRate: DoubleRange?
    var groupId: String?
    var height: ULongRange?
    var latency: DoubleRange?
    var logicalSurface: Boolean?
    var noiseSuppression: ReadonlyArray<Boolean>?
    var resizeMode: ReadonlyArray<String>?
    var sampleRate: ULongRange?
    var sampleSize: ULongRange?
    var width: ULongRange?
}
