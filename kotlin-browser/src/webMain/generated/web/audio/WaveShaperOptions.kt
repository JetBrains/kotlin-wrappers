// Automatically generated - do not modify!

package web.audio

import js.array.ReadonlyArray
import js.core.JsDouble
import js.objects.JsPlainObject

@JsPlainObject
external interface WaveShaperOptions :
    AudioNodeOptions {
    var curve: ReadonlyArray<JsDouble> /* | Float32Array */?
    var oversample: OverSampleType?
}
