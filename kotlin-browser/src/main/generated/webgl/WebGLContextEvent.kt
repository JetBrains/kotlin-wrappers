// Automatically generated - do not modify!

package webgl

import web.events.Event
import web.events.EventInit

external interface WebGLContextEventInit : EventInit {
    var statusMessage: String?
}

open external class WebGLContextEvent(
    type: String,
    init: WebGLContextEventInit = definedExternally,
) : Event {
    val statusMessage: String

    companion object
}
