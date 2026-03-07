// Automatically generated - do not modify!

package web.streams

import js.core.Void
import js.numbers.UInt53
import js.promise.PromiseLike
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface UnderlyingByteSource {
    var autoAllocateChunkSize: UInt53?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: ((controller: ReadableByteStreamController) -> PromiseLike<Void>?)?
    var start: ((controller: ReadableByteStreamController) -> Unit)?
    var type: String /* "bytes" */
}
