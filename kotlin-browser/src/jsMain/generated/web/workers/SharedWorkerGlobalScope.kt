// Automatically generated - do not modify!

package web.workers

import web.events.EventHandler
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope)
 */
sealed external class SharedWorkerGlobalScope :
    WorkerGlobalScope {
    /**
     * Returns sharedWorkerGlobal's name, i.e. the value given to the SharedWorker constructor. Multiple SharedWorker objects can correspond to the same shared worker (and SharedWorkerGlobalScope), by reusing the same name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
     */
    var onconnect: EventHandler<MessageEvent<*>, SharedWorkerGlobalScope, SharedWorkerGlobalScope>?

    /**
     * Aborts sharedWorkerGlobal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/close)
     */
    fun close(): Nothing
}
