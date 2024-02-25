// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.form

import web.events.EventTarget
import web.events.EventType

inline fun SubmitEvent(
    type: EventType<SubmitEvent<*>>,
): SubmitEvent<*> =
    SubmitEvent<EventTarget?>(
        type = type,
    )

inline fun SubmitEvent(
    type: EventType<SubmitEvent<*>>,
    init: SubmitEventInit,
): SubmitEvent<*> =
    SubmitEvent<EventTarget?>(
        type = type,
        init = init,
    )
