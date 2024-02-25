// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.serviceworker

import web.events.EventTarget
import web.events.EventType

inline fun NotificationEvent(
    type: EventType<NotificationEvent<*>>,
    init: NotificationEventInit,
): NotificationEvent<*> =
    NotificationEvent<EventTarget?>(
        type = type,
        init = init,
    )
