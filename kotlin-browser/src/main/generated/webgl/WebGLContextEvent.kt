// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webgl

import web.events.Event
import web.events.EventInit

external interface WebGLContextEventInit : EventInit {
    var statusMessage: String?
}

open external class WebGLContextEvent(
    type: String,
    eventInit: WebGLContextEventInit = definedExternally,
) : Event {
    val statusMessage: String

    companion object
}
