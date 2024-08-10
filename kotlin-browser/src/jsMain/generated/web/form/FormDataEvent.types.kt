// Automatically generated - do not modify!

package web.form

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class FormDataEventTypes {

    @JsValue("formdata")
    fun <C : EventTarget> formData(): EventType<FormDataEvent, C>
}
