// Automatically generated - do not modify!

package web.stream

sealed external interface UnderlyingByteSource {
    var autoAllocateChunkSize: Number?
    var cancel: ReadableStreamErrorCallback?
    var pull: ReadableByteStreamControllerCallback?
    var start: ReadableByteStreamControllerCallback?
    var type: String /* 'bytes' */
}
