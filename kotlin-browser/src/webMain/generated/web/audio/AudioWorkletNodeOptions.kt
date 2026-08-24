// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.numbers.JsDouble
import js.numbers.JsUInt
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/AudioWorkletNode#options)
 */
@JsPlainObject
external interface AudioWorkletNodeOptions :
    AudioNodeOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/AudioWorkletNode#numberofinputs)
     */
    var numberOfInputs: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/AudioWorkletNode#numberofoutputs)
     */
    var numberOfOutputs: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/AudioWorkletNode#outputchannelcount)
     */
    var outputChannelCount: ReadonlyArray<JsUInt>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/AudioWorkletNode#parameterdata)
     */
    var parameterData: ReadonlyRecord<JsString, JsDouble>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/AudioWorkletNode#processoroptions)
     */
    var processorOptions: JsAny?
}
