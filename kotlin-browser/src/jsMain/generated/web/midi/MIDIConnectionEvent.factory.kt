// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.midi

import web.events.EventTarget
import web.events.EventType

inline fun MIDIConnectionEvent(
    type: EventType<MIDIConnectionEvent<*>>,
): MIDIConnectionEvent<*> =
    MIDIConnectionEvent<EventTarget?>(
        type = type,
    )

inline fun MIDIConnectionEvent(
    type: EventType<MIDIConnectionEvent<*>>,
    init: MIDIConnectionEventInit,
): MIDIConnectionEvent<*> =
    MIDIConnectionEvent<EventTarget?>(
        type = type,
        init = init,
    )
