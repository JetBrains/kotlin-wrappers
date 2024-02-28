// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.form

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external interface SubmitEventTypes_deprecated {
    @Deprecated(
        message = "Legacy type declaration. Use type function instead!",
        replaceWith = ReplaceWith("SubmitEvent.submit()"),
    )
    @JsValue("submit")
    val SUBMIT: EventType<SubmitEvent<EventTarget>>
        get() = definedExternally
}
