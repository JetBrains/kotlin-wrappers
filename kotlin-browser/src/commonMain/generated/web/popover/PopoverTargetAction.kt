// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.popover

import seskar.js.JsValue

sealed external interface PopoverTargetAction {
    companion object {
        @JsValue("hide")
        val hide: PopoverTargetAction

        @JsValue("show")
        val show: PopoverTargetAction

        @JsValue("toggle")
        val toggle: PopoverTargetAction
    }
}
