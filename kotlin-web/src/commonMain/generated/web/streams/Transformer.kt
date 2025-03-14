// Automatically generated - do not modify!

package web.streams

import js.objects.JsPlainObject

@JsPlainObject
external interface Transformer<I, O> {
    val flush: TransformerFlushCallback<O>?
    val start: TransformerStartCallback<O>?
    val transform: TransformerTransformCallback<I, O>?
}
