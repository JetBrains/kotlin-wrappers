// Automatically generated - do not modify!

package web.streams

import js.core.UInt53
import js.core.Void
import js.promise.PromiseLike

sealed external interface UnderlyingByteSource {
    var autoAllocateChunkSize: UInt53?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: ((controller: ReadableByteStreamController) -> PromiseLike<Void>?)?
    var start: ((controller: ReadableByteStreamController) -> Unit)?
    var type: String /* "bytes" */
}
