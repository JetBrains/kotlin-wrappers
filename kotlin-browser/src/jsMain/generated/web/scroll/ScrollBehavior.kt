// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.scroll

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScrollBehavior {
    companion object {
        @JsValue("auto")
        val auto: ScrollBehavior

        @JsValue("instant")
        val instant: ScrollBehavior

        @JsValue("smooth")
        val smooth: ScrollBehavior
    }
}
