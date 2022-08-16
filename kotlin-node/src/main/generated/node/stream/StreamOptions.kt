// Automatically generated - do not modify!

package node.stream

import node.events.Abortable

sealed external interface StreamOptions<T : Stream> : Abortable {
    var emitClose: Boolean?
    var highWaterMark: Number?
    var objectMode: Boolean?

    /* this: T */
    var construct: ((callback: (error: Error?) -> Unit) -> Unit)?

    /* this: T */
    var destroy: ((
        error: Error?,
        callback: (error: Error?) -> Unit,
    ) -> Unit)?
    var autoDestroy: Boolean?
}
