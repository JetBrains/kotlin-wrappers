// Automatically generated - do not modify!

package webgl

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface WebGLContextEventInit : EventInit {
    var statusMessage: String?
}

open external class WebGLContextEvent(
    type: EventType<WebGLContextEvent>,
    init: WebGLContextEventInit = definedExternally,
) : Event {
    val statusMessage: String

    companion object
}
