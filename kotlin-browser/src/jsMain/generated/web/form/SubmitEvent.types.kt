// Automatically generated - do not modify!

package web.form

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class SubmitEventTypes :
    SubmitEventTypes_deprecated {

    @JsValue("submit")
    fun <C : EventTarget> submit(): EventType<SubmitEvent<C>>
}
