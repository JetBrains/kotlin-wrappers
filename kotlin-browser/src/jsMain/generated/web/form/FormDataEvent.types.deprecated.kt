// Automatically generated - do not modify!

package web.form

import seskar.js.JsValue
import web.events.EventType

sealed external class FormDataEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("FormDataEvent.FORM_DATA"),
    )
    @JsValue("formdata")
    fun formData(): EventType<FormDataEvent>
}
