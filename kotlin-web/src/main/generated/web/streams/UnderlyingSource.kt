// Automatically generated - do not modify!

package web.streams

import js.core.Void

sealed external interface UnderlyingSource<R> {
    var cancel: UnderlyingSourceCancelCallback?
    var pull: UnderlyingSourcePullCallback<R>?
    var start: UnderlyingSourceStartCallback<R>?
    var type: Void
}
