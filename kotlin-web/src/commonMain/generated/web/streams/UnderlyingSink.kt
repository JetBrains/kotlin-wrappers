// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface UnderlyingSink<W : JsAny?> {
    val abort: UnderlyingSinkAbortCallback?
    val close: UnderlyingSinkCloseCallback?
    val start: UnderlyingSinkStartCallback?
    val write: UnderlyingSinkWriteCallback<W>?
}
