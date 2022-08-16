// Automatically generated - do not modify!

package node.events

import node.AbortSignal

external interface Abortable {
    /**
     * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
     */
    var signal: AbortSignal?
}
