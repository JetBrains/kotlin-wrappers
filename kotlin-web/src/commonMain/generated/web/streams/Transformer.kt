// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface Transformer<I : JsAny?, O : JsAny?> {
    val flush: TransformerFlushCallback<O>?
    val start: TransformerStartCallback<O>?
    val transform: TransformerTransformCallback<I, O>?
}
