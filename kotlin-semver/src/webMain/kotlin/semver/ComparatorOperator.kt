package semver

import seskar.js.JsValue

sealed external interface ComparatorOperator {
    companion object {
        @JsValue("")
        val empty: ComparatorOperator

        @JsValue("=")
        val equal: ComparatorOperator

        @JsValue("<")
        val less: ComparatorOperator

        @JsValue(">")
        val greater: ComparatorOperator

        @JsValue("<=")
        val lessEqual: ComparatorOperator

        @JsValue(">=")
        val greaterEqual: ComparatorOperator
    }
}
