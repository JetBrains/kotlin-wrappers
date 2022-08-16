// Automatically generated - do not modify!

package node.stream

import node.events.Abortable

sealed external interface FinishedOptions : Abortable {
    var error: Boolean?
    var readable: Boolean?
    var writable: Boolean?
}
