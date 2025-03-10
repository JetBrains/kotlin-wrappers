// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
