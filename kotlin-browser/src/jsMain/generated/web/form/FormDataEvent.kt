// Automatically generated - do not modify!

package web.form

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent)
 */
open external class FormDataEvent(
    override val type: EventType<FormDataEvent>,
    init: FormDataEventInit,
) : Event {
    /**
     * Returns a FormData object representing names and values of elements associated to the target form. Operations on the FormData object will affect form data to be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent/formData)
     */
    val formData: FormData

    @JsAlias(THIS)
    override fun asInit(): FormDataEventInit

    companion object {
        @JsValue("formdata")
        val FORM_DATA: EventType<FormDataEvent>
    }
}
