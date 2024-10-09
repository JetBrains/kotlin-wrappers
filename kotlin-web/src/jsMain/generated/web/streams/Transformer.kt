// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Transformer<I, O> {
    val flush: TransformerFlushCallback<O>?
    val readableType: Void
    val start: TransformerStartCallback<O>?
    val transform: TransformerTransformCallback<I, O>?
    val writableType: Void
}
