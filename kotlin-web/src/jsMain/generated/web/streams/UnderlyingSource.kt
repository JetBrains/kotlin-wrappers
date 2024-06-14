// Automatically generated - do not modify!

package web.streams

import js.core.JsLong

@kotlinx.js.JsPlainObject_KT_68943
sealed external interface UnderlyingSource<R> {
    var autoAllocateChunkSize: JsLong?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: UnderlyingSourcePullCallback<R>?
    var start: UnderlyingSourceStartCallback<R>?
    var type: ReadableStreamType?
}
