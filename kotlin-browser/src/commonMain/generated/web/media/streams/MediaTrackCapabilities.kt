// Automatically generated - do not modify!

package web.media.streams

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.JsString
import js.objects.JsPlainObject

@JsPlainObject
external interface MediaTrackCapabilities {
    val aspectRatio: DoubleRange?
    val autoGainControl: ReadonlyArray<JsBoolean>?
    val backgroundBlur: ReadonlyArray<JsBoolean>?
    val channelCount: ULongRange?
    val deviceId: String?
    val displaySurface: String?
    val echoCancellation: ReadonlyArray<JsBoolean>?
    val facingMode: ReadonlyArray<JsString>?
    val frameRate: DoubleRange?
    val groupId: String?
    val height: ULongRange?
    val noiseSuppression: ReadonlyArray<JsBoolean>?
    val sampleRate: ULongRange?
    val sampleSize: ULongRange?
    val width: ULongRange?
}
