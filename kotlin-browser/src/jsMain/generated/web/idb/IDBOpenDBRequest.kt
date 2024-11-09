// Automatically generated - do not modify!

package web.idb

import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent

/**
 * Also inherits methods from its parents IDBRequest and EventTarget.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest)
 */
external class IDBOpenDBRequest
private constructor() :
    IDBRequest<IDBDatabase> {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event)
     */
    var onblocked: EventHandler<IDBVersionChangeEvent, IDBOpenDBRequest, IDBOpenDBRequest>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event)
     */
    var onupgradeneeded: EventHandler<IDBVersionChangeEvent, IDBOpenDBRequest, IDBOpenDBRequest>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event)
     */
    @JsEvent("blocked")
    val blockedEvent: EventInstance<IDBVersionChangeEvent, IDBOpenDBRequest /* this */, IDBOpenDBRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/success_event)
     */
    @JsEvent("success")
    override val successEvent: EventInstance<IDBVersionChangeEvent, IDBOpenDBRequest /* this */, IDBOpenDBRequest /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event)
     */
    @JsEvent("upgradeneeded")
    val upgradeneededEvent: EventInstance<IDBVersionChangeEvent, IDBOpenDBRequest /* this */, IDBOpenDBRequest /* this */>
}
