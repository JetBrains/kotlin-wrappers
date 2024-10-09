// Automatically generated - do not modify!

package web.streams

import js.core.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UnderlyingSink<W> {
    val abort: UnderlyingSinkAbortCallback?
    val close: UnderlyingSinkCloseCallback?
    val start: UnderlyingSinkStartCallback?
    val type: Void
    val write: UnderlyingSinkWriteCallback<W>?
}
