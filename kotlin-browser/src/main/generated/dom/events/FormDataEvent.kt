// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package dom.events

import web.events.Event
import web.events.EventInit
import web.events.EventType
import web.http.FormData

external interface FormDataEventInit : EventInit {
    var formData: FormData
}

open external class FormDataEvent(
    override val type: EventType<FormDataEvent>,
    init: FormDataEventInit,
) : Event {
    /** Returns a FormData object representing names and values of elements associated to the target form. Operations on the FormData object will affect form data to be submitted. */
    val formData: FormData

    companion object
}
