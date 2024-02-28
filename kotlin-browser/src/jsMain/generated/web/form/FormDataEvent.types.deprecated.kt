// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.form

import seskar.js.JsValue
import web.events.EventType

sealed external interface FormDataEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("FormDataEvent.formData()"),
    )
    @JsValue("formdata")
    val FORM_DATA: EventType<FormDataEvent<*>>
        get() = definedExternally
}
