// Automatically generated - do not modify!

package web.streams

import js.core.Int53
import js.core.Void
import js.promise.PromiseLike

sealed external interface UnderlyingByteSource {
    var autoAllocateChunkSize: Int53?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: ((controller: ReadableByteStreamController) -> PromiseLike<Void>?)?
    var start: ((controller: ReadableByteStreamController) -> Unit)?
    var type: String /* "bytes" */
}
