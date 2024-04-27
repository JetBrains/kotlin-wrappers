package react.select

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
