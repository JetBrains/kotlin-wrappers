// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package dom.events

import dom.html.HTMLElement
import web.events.Event
import web.events.EventInit

external interface SubmitEventInit : EventInit {
    var submitter: HTMLElement?
}

sealed external class SubmitEvent : Event {
    companion object
}
