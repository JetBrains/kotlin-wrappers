// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.core.JsDouble
import js.objects.JsPlainObject

@JsPlainObject
external interface IIRFilterOptions :
    AudioNodeOptions {
    val feedback: ReadonlyArray<JsDouble>
    val feedforward: ReadonlyArray<JsDouble>
}
