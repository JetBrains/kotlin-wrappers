// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.form

import seskar.js.JsValue
import web.events.EventType

sealed external interface SubmitEventTypes {
    @JsValue("submit")
    val SUBMIT: EventType<SubmitEvent>
        get() = definedExternally
}
