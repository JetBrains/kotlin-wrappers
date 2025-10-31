// Automatically generated - do not modify!

package web.push

import web.events.EventType
import web.serviceworker.ExtendableEvent
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 */
open external class PushSubscriptionChangeEvent(
    override val type: EventType<PushSubscriptionChangeEvent>,
    init: PushSubscriptionChangeEventInit = definedExternally,
) : ExtendableEvent {
    val newSubscription: PushSubscription?
    val oldSubscription: PushSubscription?
}
