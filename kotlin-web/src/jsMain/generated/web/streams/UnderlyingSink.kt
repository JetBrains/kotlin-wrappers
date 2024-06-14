// Automatically generated - do not modify!

package web.streams

import js.core.Void

@kotlinx.js.JsPlainObject_KT_68943
sealed external interface UnderlyingSink<W> {
    var abort: UnderlyingSinkAbortCallback?
    var close: UnderlyingSinkCloseCallback?
    var start: UnderlyingSinkStartCallback?
    var type: Void
    var write: UnderlyingSinkWriteCallback<W>?
}
