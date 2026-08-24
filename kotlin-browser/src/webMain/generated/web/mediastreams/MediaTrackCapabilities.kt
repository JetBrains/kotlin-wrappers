// Automatically generated - do not modify!

package web.mediastreams

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#return_value)
 */
@JsPlainObject
external interface MediaTrackCapabilities {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#aspectratio)
     */
    var aspectRatio: DoubleRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#autogaincontrol)
     */
    var autoGainControl: ReadonlyArray<JsBoolean>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#backgroundblur)
     */
    var backgroundBlur: ReadonlyArray<JsBoolean>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#channelcount)
     */
    var channelCount: ULongRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#deviceid)
     */
    var deviceId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#displaysurface)
     */
    var displaySurface: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#echocancellation)
     */
    var echoCancellation: ReadonlyArray<*>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#facingmode)
     */
    var facingMode: ReadonlyArray<JsString>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#framerate)
     */
    var frameRate: DoubleRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#groupid)
     */
    var groupId: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#height)
     */
    var height: ULongRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#noisesuppression)
     */
    var noiseSuppression: ReadonlyArray<JsBoolean>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#samplerate)
     */
    var sampleRate: ULongRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#samplesize)
     */
    var sampleSize: ULongRange?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities#width)
     */
    var width: ULongRange?
}
