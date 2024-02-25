// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.serviceworker

import web.events.EventTarget
import web.events.EventType

inline fun ExtendableEvent(
    type: EventType<ExtendableEvent<*>>,
): ExtendableEvent<*> =
    ExtendableEvent<EventTarget?>(
        type = type,
    )

inline fun ExtendableEvent(
    type: EventType<ExtendableEvent<*>>,
    init: ExtendableEventInit,
): ExtendableEvent<*> =
    ExtendableEvent<EventTarget?>(
        type = type,
        init = init,
    )
