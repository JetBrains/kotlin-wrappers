// Automatically generated - do not modify!

package web.messaging

import js.internal.InternalApi
import web.events.EventHandler
import web.events.EventTargetLike

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface MessageEventTarget :
    EventTargetLike {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/message_event)
     */
    var onmessage: EventHandler<MessageEvent<*>, MessageEventTarget, MessageEventTarget>?
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/messageerror_event)
     */
    var onmessageerror: EventHandler<MessageEvent<*>, MessageEventTarget, MessageEventTarget>?
        get() = definedExternally
        set(value) = definedExternally
}
