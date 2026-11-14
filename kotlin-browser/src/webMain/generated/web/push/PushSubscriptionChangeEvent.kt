// Automatically generated - do not modify!

package web.push

import web.events.EventType
import web.serviceworker.ExtendableEvent

/**
 * Available only in secure contexts.
 */
open external class PushSubscriptionChangeEvent(
    override val type: EventType<PushSubscriptionChangeEvent>,
    init: PushSubscriptionChangeEventInit = definedExternally,
) : ExtendableEvent {
    open val newSubscription: PushSubscription?
    open val oldSubscription: PushSubscription?

    companion object
}

inline val PushSubscriptionChangeEvent.Companion.PUSHSUBSCRIPTIONCHANGE: EventType<PushSubscriptionChangeEvent>
    get() = EventType("pushsubscriptionchange")
