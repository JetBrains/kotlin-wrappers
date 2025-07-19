// Automatically generated - do not modify!

package web.workers

import js.core.JsAny
import web.events.EventHandler
import web.events.EventInstance
import web.messaging.MessageEvent

/**
 * The **`SharedWorkerGlobalScope`** object (the SharedWorker global scope) is accessible through the window.self keyword.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope)
 */
open external class SharedWorkerGlobalScope
private constructor() :
    WorkerGlobalScope {
    /**
     * The **`name`** read-only property of the that the SharedWorker.SharedWorker constructor can pass to get a reference to the SharedWorkerGlobalScope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
     */
    var onconnect: EventHandler<MessageEvent<*>, SharedWorkerGlobalScope, SharedWorkerGlobalScope>?

    /**
     * The **`close()`** method of the SharedWorkerGlobalScope interface discards any tasks queued in the `SharedWorkerGlobalScope`'s event loop, effectively closing this particular scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/close)
     */
    fun close()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
 */
inline val <C : SharedWorkerGlobalScope> C.connectEvent: EventInstance<MessageEvent<JsAny?>, C, C>
    get() = EventInstance(this, "connect")
