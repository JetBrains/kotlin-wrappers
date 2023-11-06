@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.select

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface InputAction {
    companion object {
        @JsValue("set-value")
        val setValue: InputAction

        @JsValue("input-change")
        val inputChange: InputAction

        @JsValue("input-blur")
        val inputBlur: InputAction

        @JsValue("menu-close")
        val menuClose: InputAction
    }
}
