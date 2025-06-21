// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.objects.JsPlainObject

@JsPlainObject
external interface UnderlyingSink<W : JsAny?> {
    var abort: UnderlyingSinkAbortCallback?
    var close: UnderlyingSinkCloseCallback?
    var start: UnderlyingSinkStartCallback?
    var write: UnderlyingSinkWriteCallback<W>?
}
