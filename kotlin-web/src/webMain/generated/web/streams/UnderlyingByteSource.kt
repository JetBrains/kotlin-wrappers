// Automatically generated - do not modify!

package web.streams

import js.numbers.UInt53
import js.promise.PromiseLike
import js.void.Void
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/ReadableStream#underlyingsource)
 */
@JsPlainObject
external interface UnderlyingByteSource {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/ReadableStream#autoallocatechunksize)
     */
    var autoAllocateChunkSize: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/ReadableStream#cancel)
     */
    var cancel: UnderlyingSourceCancelCallback?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/ReadableStream#pull)
     */
    var pull: ((controller: ReadableByteStreamController) -> PromiseLike<Void>?)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/ReadableStream#start)
     */
    var start: ((controller: ReadableByteStreamController) -> Unit)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/ReadableStream#type)
     */
    var type: String /* "bytes" */
}
