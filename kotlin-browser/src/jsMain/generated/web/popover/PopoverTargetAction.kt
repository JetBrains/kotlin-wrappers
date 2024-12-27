// Automatically generated - do not modify!

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
