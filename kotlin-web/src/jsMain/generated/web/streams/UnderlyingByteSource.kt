// Automatically generated - do not modify!

package web.streams

import js.core.JsLong
import js.core.Void
import js.promise.PromiseLike

sealed external interface UnderlyingByteSource {
    var autoAllocateChunkSize: JsLong?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: (controller: ReadableByteStreamController) -> PromiseLike<Void>?
    var start: (controller: ReadableByteStreamController) -> Unit?
    var type: String /* "bytes" */
}
