package react.select

import seskar.js.JsValue

sealed /* union */
external interface Action {
    companion object {
        @JsValue("select-option")
        val selectOption: Action

        @JsValue("deselect-option")
        val deselectOption: Action

        @JsValue("remove-value")
        val removeValue: Action

        @JsValue("pop-value")
        val popValue: Action

        @JsValue("clear")
        val clear: Action

        @JsValue("create-option")
        val createOption: Action
    }
}
