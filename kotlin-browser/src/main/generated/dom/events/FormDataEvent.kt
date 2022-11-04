// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package dom.events

import web.events.Event
import web.events.EventInit

external interface FormDataEventInit : EventInit {
    var formData: FormData
}

sealed external class FormDataEvent : Event {
    companion object
}
