// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.events

inline fun Event(
    type: EventType<Event<*>>,
): Event<*> =
    Event<EventTarget?>(
        type = type,
    )

inline fun Event(
    type: EventType<Event<*>>,
    init: EventInit,
): Event<*> =
    Event<EventTarget?>(
        type = type,
        init = init,
    )
