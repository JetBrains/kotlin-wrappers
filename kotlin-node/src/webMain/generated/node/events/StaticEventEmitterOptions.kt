// Automatically generated - do not modify!

package node.events

import web.abort.AbortSignal

@js.objects.JsPlainObject
sealed external interface StaticEventEmitterOptions {
    /**
     * Can be used to cancel awaiting events.
     */
    var signal: AbortSignal?
}
