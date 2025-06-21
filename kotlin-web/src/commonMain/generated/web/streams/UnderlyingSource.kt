// Automatically generated - do not modify!

package web.streams

import js.core.JsAny
import js.core.UInt53
import js.objects.JsPlainObject

@JsPlainObject
external interface UnderlyingSource<R : JsAny?> {
    var autoAllocateChunkSize: UInt53?
    var cancel: UnderlyingSourceCancelCallback?
    var pull: UnderlyingSourcePullCallback<R>?
    var start: UnderlyingSourceStartCallback<R>?
    var type: ReadableStreamType?
}
