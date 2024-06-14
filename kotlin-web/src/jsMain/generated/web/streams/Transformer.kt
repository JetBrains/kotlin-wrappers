// Automatically generated - do not modify!

package web.streams

import js.core.Void

@kotlinx.js.JsPlainObject_KT_68943
sealed external interface Transformer<I, O> {
    var flush: TransformerFlushCallback<O>?
    var readableType: Void
    var start: TransformerStartCallback<O>?
    var transform: TransformerTransformCallback<I, O>?
    var writableType: Void
}
