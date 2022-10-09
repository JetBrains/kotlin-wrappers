// Automatically generated - do not modify!

package web.streams

import kotlinx.js.Void

sealed external interface UnderlyingSource<R> {
    var cancel: UnderlyingSourceCancelCallback?
    var pull: UnderlyingSourcePullCallback<R>?
    var start: UnderlyingSourceStartCallback<R>?
    var type: Void
}
