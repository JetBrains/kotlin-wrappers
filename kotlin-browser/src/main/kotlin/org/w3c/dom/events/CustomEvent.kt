@file:Suppress(
    "NOTHING_TO_INLINE",
)

package org.w3c.dom.events

import org.w3c.dom.CustomEvent
import org.w3c.dom.CustomEventInit

inline fun CustomEvent(
    type: EventType<CustomEvent>,
    init: CustomEventInit,
): CustomEvent =
    CustomEvent(
        type = type.unsafeCast<String>(),
        eventInitDict = init,
    )
