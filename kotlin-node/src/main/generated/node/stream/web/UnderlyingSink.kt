// Automatically generated - do not modify!

package node.stream.web

import kotlinx.js.Void

sealed external interface UnderlyingSink<W> {
    var abort: UnderlyingSinkAbortCallback?
    var close: UnderlyingSinkCloseCallback?
    var start: UnderlyingSinkStartCallback?
    var type: Void
    var write: UnderlyingSinkWriteCallback<W>?
}
