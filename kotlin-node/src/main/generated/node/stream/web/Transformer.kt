// Automatically generated - do not modify!

package node.stream.web

import kotlinx.js.Void

sealed external interface Transformer<I, O> {
    var flush: TransformerFlushCallback<O>?
    var readableType: Void
    var start: TransformerStartCallback<O>?
    var transform: TransformerTransformCallback<I, O>?
    var writableType: Void
}
