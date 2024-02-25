// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.fonts

import web.events.EventTarget
import web.events.EventType

inline fun FontFaceSetLoadEvent(
    type: EventType<FontFaceSetLoadEvent<*>>,
): FontFaceSetLoadEvent<*> =
    FontFaceSetLoadEvent<EventTarget?>(
        type = type,
    )

inline fun FontFaceSetLoadEvent(
    type: EventType<FontFaceSetLoadEvent<*>>,
    init: FontFaceSetLoadEventInit,
): FontFaceSetLoadEvent<*> =
    FontFaceSetLoadEvent<EventTarget?>(
        type = type,
        init = init,
    )
