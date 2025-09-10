// Automatically generated - do not modify!

package web.streams

import js.core.Void
import js.objects.JsPlainObject
import js.promise.PromiseLike
import kotlin.js.JsAny

@JsPlainObject
external interface UnderlyingDefaultSource<R : JsAny?> {
    var cancel: UnderlyingSourceCancelCallback?
    var pull: ((controller: ReadableStreamDefaultController<R>) -> PromiseLike<Void>?)?
    var start: ((controller: ReadableStreamDefaultController<R>) -> Unit)?
}
