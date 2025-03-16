// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface UnderlyingSource<R : JsAny?> {
    val autoAllocateChunkSize: UInt53?
    val cancel: UnderlyingSourceCancelCallback?
    val pull: UnderlyingSourcePullCallback<R>?
    val start: UnderlyingSourceStartCallback<R>?
    val type: ReadableStreamType?
}
