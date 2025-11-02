// Automatically generated - do not modify!

package web.form

import web.events.Event
import web.events.EventType

/**
 * The **`FormDataEvent`** interface represents a formdata event — such an event is fired on an HTMLFormElement object after the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be triggered by the invocation of a FormData() constructor.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent)
 */
open external class FormDataEvent(
    override val type: EventType<FormDataEvent>,
    init: FormDataEventInit,
) : Event {
    /**
     * The **`formData`** read-only property of the FormDataEvent interface contains the FormData object representing the data contained in the form when the event was fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent/formData)
     */
    val formData: FormData

    companion object
}

inline val FormDataEvent.Companion.FORM_DATA: EventType<FormDataEvent>
    get() = EventType("formdata")
