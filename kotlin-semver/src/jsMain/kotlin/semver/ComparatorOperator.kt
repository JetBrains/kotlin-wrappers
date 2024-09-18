package semver

import seskar.js.JsValue

sealed external interface ComparatorOperator {
    companion object {
        @JsValue("")
        val EMPTY: ComparatorOperator

        @JsValue("=")
        val EQUAL: ComparatorOperator

        @JsValue("<")
        val LT: ComparatorOperator

        @JsValue(">")
        val GT: ComparatorOperator

        @JsValue("<=")
        val LTE: ComparatorOperator

        @JsValue(">=")
        val GTE: ComparatorOperator
    }
}
