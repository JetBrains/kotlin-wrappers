// Automatically generated - do not modify!

package web.workers

import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.messaging.MessageEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope)
 */
external class SharedWorkerGlobalScope
private constructor() :
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
    fun close()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
     */
    @JsEvent("connect")
    val connectEvent: EventInstance<MessageEvent<Any?>, SharedWorkerGlobalScope /* this */, SharedWorkerGlobalScope /* this */>
}
