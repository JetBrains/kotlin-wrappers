// Automatically generated - do not modify!

package web.streams

sealed external interface UnderlyingSource<R> {
    var autoAllocateChunkSize: Int?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: UnderlyingSourcePullCallback<R>?
    var start: UnderlyingSourceStartCallback<R>?
    var type: ReadableStreamType?
}
