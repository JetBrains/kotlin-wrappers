// Automatically generated - do not modify!

package web.streams

import js.promise.PromiseLike
import js.void.Void
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UnderlyingDefaultSource<R : JsAny?> {
    var cancel: UnderlyingSourceCancelCallback?
    var pull: ((controller: ReadableStreamDefaultController<R>) -> PromiseLike<Void>?)?
    var start: ((controller: ReadableStreamDefaultController<R>) -> Unit)?
}
