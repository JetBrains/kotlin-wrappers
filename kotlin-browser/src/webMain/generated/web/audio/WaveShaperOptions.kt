// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.numbers.JsDouble
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/WaveShaperNode#options)
 */
@JsPlainObject
external interface WaveShaperOptions :
    AudioNodeOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/WaveShaperNode#curve)
     */
    var curve: ReadonlyArray<JsDouble> /* | Float32Array */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WaveShaperNode/WaveShaperNode#oversample)
     */
    var oversample: OverSampleType?
}
