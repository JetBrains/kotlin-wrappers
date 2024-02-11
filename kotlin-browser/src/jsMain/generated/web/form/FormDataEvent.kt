// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.form

import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent)
 */
open external class FormDataEvent(
    override val type: EventType<FormDataEvent>,
    init: FormDataEventInit,
) : Event,
    FormDataEventInit {
    /**
     * Returns a FormData object representing names and values of elements associated to the target form. Operations on the FormData object will affect form data to be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent/formData)
     */
    override val formData: FormData

    companion object : FormDataEventTypes
}
