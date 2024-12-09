// Automatically generated - do not modify!

package web.streams

import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
external interface UnderlyingSource<R> {
    val autoAllocateChunkSize: JsLong?
    val cancel: UnderlyingSourceCancelCallback?
    val pull: UnderlyingSourcePullCallback<R>?
    val start: UnderlyingSourceStartCallback<R>?
    val type: ReadableStreamType?
}
