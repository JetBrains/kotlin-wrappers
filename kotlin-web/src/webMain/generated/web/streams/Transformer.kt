// Automatically generated - do not modify!

package web.streams

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface Transformer<I : JsAny?, O : JsAny?> {
    var flush: TransformerFlushCallback<O>?
    var start: TransformerStartCallback<O>?
    var transform: TransformerTransformCallback<I, O>?
}
