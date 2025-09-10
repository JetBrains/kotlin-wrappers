// Automatically generated - do not modify!

package web.mediastreams

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.objects.JsPlainObject
import kotlin.js.JsString

@JsPlainObject
external interface MediaTrackCapabilities {
    var aspectRatio: DoubleRange?
    var autoGainControl: ReadonlyArray<JsBoolean>?
    var backgroundBlur: ReadonlyArray<JsBoolean>?
    var channelCount: ULongRange?
    var deviceId: String?
    var displaySurface: String?
    var echoCancellation: ReadonlyArray<*>?
    var facingMode: ReadonlyArray<JsString>?
    var frameRate: DoubleRange?
    var groupId: String?
    var height: ULongRange?
    var noiseSuppression: ReadonlyArray<JsBoolean>?
    var sampleRate: ULongRange?
    var sampleSize: ULongRange?
    var width: ULongRange?
}
