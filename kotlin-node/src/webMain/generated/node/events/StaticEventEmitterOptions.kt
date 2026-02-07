// Automatically generated - do not modify!

package node.events

import web.abort.AbortSignal

@kotlinx.js.JsPlainObject
sealed external interface StaticEventEmitterOptions {
    /**
     * Can be used to cancel awaiting events.
     */
    var signal: AbortSignal?
}
