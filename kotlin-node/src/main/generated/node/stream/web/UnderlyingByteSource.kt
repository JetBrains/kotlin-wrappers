// Automatically generated - do not modify!

package node.stream.web

sealed external interface UnderlyingByteSource {
    var autoAllocateChunkSize: Number?
    var cancel: ReadableStreamErrorCallback?
    var pull: ReadableByteStreamControllerCallback?
    var start: ReadableByteStreamControllerCallback?
    var type: String /* 'bytes' */
}
