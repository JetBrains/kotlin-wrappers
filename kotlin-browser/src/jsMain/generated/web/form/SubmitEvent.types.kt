// Automatically generated - do not modify!

package web.form

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class SubmitEventTypes {

    @JsValue("submit")
    fun <C : EventTarget> submit(): EventType<SubmitEvent, C>
}
