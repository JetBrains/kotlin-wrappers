// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface IIRFilterOptions :
    AudioNodeOptions {
    var feedback: ReadonlyArray<Number>
    var feedforward: ReadonlyArray<Number>
}
