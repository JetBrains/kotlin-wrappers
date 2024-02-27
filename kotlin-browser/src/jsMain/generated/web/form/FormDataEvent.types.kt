// Automatically generated - do not modify!

package web.form

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class FormDataEventTypes :
    FormDataEventTypes_deprecated {

    @JsValue("formdata")
    fun <C : EventTarget> formData(): EventType<FormDataEvent<C>>
}
