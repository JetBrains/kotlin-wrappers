// Automatically generated - do not modify!

package web.gl

import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **WebGLContextEvent** interface is part of the WebGL API and is an interface for an event that is generated in response to a status change to the WebGL rendering context.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLContextEvent)
 */
open external class WebGLContextEvent(
    override val type: EventType<WebGLContextEvent>,
    init: WebGLContextEventInit = definedExternally,
) : Event {
    /**
     * The read-only **`WebGLContextEvent.statusMessage`** property contains additional event status information, or is an empty string if no additional information is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLContextEvent/statusMessage)
     */
    val statusMessage: String

    companion object
}

inline val WebGLContextEvent.Companion.WEBGL_CONTEXT_CREATION_ERROR: EventType<WebGLContextEvent>
    get() = EventType("webglcontextcreationerror")

inline val WebGLContextEvent.Companion.WEBGL_CONTEXT_LOST: EventType<WebGLContextEvent>
    get() = EventType("webglcontextlost")

inline val WebGLContextEvent.Companion.WEBGL_CONTEXT_RESTORED: EventType<WebGLContextEvent>
    get() = EventType("webglcontextrestored")
