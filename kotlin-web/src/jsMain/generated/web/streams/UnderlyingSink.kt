// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface UnderlyingSink<W> {
    var abort: UnderlyingSinkAbortCallback?
    var close: UnderlyingSinkCloseCallback?
    var start: UnderlyingSinkStartCallback?
    var type: Void
    var write: UnderlyingSinkWriteCallback<W>?
}
