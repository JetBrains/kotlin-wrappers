// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.core.Void
import js.promise.PromiseLike

sealed external interface UnderlyingDefaultSource<R : JsAny?> {
    var cancel: UnderlyingSourceCancelCallback?
    var pull: ((controller: ReadableStreamDefaultController<R>) -> PromiseLike<Void>?)?
    var start: ((controller: ReadableStreamDefaultController<R>) -> Unit)?
}
