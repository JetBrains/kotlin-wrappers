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

open external class FormDataEvent(
    type: String,
    init: FormDataEventInit,
) : Event {
    /** Returns a FormData object representing names and values of elements associated to the target form. Operations on the FormData object will affect form data to be submitted. */
    val formData: FormData

    companion object
}
