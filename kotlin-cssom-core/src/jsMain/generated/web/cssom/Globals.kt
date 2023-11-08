// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Globals : GlobalsType {
    companion object {
        @JsValue("inherit")
        val inherit: Globals

        @JsValue("initial")
        val initial: Globals

        @JsValue("revert")
        val revert: Globals

        @JsValue("revert-layer")
        val revertLayer: Globals

        @JsValue("unset")
        val unset: Globals
    }
}
