// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.midi

import web.events.EventTarget
import web.events.EventType

inline fun MIDIMessageEvent(
    type: EventType<MIDIMessageEvent<*>>,
): MIDIMessageEvent<*> =
    MIDIMessageEvent<EventTarget?>(
        type = type,
    )

inline fun MIDIMessageEvent(
    type: EventType<MIDIMessageEvent<*>>,
    init: MIDIMessageEventInit,
): MIDIMessageEvent<*> =
    MIDIMessageEvent<EventTarget?>(
        type = type,
        init = init,
    )