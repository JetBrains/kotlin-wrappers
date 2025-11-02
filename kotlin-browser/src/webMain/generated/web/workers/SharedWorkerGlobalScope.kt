// Automatically generated - do not modify!

package web.workers

import js.closeable.JsCloseable
import web.events.EventHandler
import web.events.EventInstance
import web.messaging.MessageEvent
import kotlin.js.JsAny

/**
 * The **`SharedWorkerGlobalScope`** object (the SharedWorker global scope) is accessible through the self keyword. Some additional global functions, namespaces objects, and constructors, not typically associated with the worker global scope, but available on it, are listed in the JavaScript Reference. See the complete list of functions available to workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope)
 */
open external class SharedWorkerGlobalScope
private constructor() :
    WorkerGlobalScope,
    JsCloseable {
    /**
     * The **`name`** read-only property of the SharedWorkerGlobalScope interface returns the name that the SharedWorker was (optionally) given when it was created. This is the name that the SharedWorker() constructor can pass to get a reference to the SharedWorkerGlobalScope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
     */
    var onconnect: EventHandler<MessageEvent<*>, SharedWorkerGlobalScope, SharedWorkerGlobalScope>?

    /**
     * The **`close()`** method of the SharedWorkerGlobalScope interface discards any tasks queued in the SharedWorkerGlobalScope's event loop, effectively closing this particular scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/close)
     */
    override fun close()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
 */
inline val <C : SharedWorkerGlobalScope> C.connectEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "connect")
