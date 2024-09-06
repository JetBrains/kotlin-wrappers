// Automatically generated - do not modify!

package web.form

import seskar.js.JsValue
import web.events.EventType

sealed external class SubmitEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SubmitEvent.SUBMIT"),
    )
    @JsValue("submit")
    fun submit(): EventType<SubmitEvent>
}
