// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.gl

import web.events.EventTarget
import web.events.EventType

inline fun WebGLContextEvent(
    type: EventType<WebGLContextEvent<*>>,
): WebGLContextEvent<*> =
    WebGLContextEvent<EventTarget?>(
        type = type,
    )

inline fun WebGLContextEvent(
    type: EventType<WebGLContextEvent<*>>,
    init: WebGLContextEventInit,
): WebGLContextEvent<*> =
    WebGLContextEvent<EventTarget?>(
        type = type,
        init = init,
    )
