// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.numbers.JsDouble
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode/IIRFilterNode#options)
 */
@JsPlainObject
external interface IIRFilterOptions :
    AudioNodeOptions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode/IIRFilterNode#feedback)
     */
    var feedback: ReadonlyArray<JsDouble>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IIRFilterNode/IIRFilterNode#feedforward)
     */
    var feedforward: ReadonlyArray<JsDouble>
}
