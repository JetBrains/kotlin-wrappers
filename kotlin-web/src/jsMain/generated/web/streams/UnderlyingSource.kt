// Automatically generated - do not modify!

package web.streams

sealed external interface UnderlyingSource<R> {
    var autoAllocateChunkSize: Number?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: UnderlyingSourcePullCallback?
    var start: UnderlyingSourceStartCallback?
    var type: ReadableStreamType?
}
