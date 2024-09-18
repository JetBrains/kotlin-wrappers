package semver

import seskar.js.JsValue

sealed external interface Operator {
    companion object {
        @JsValue("===")
        val EQUALS_STRICT: Operator

        @JsValue("!==")
        val NOT_EQUALS_STRICT: Operator

        @JsValue("")
        val EMPTY: Operator

        @JsValue("=")
        val ASSIGN: Operator

        @JsValue("==")
        val EQUALS: Operator

        @JsValue("!=")
        val NOT_EQUALS: Operator

        @JsValue(">")
        val GT: Operator

        @JsValue(">=")
        val GTE: Operator

        @JsValue("<")
        val LT: Operator

        @JsValue("<=")
        val LTE: Operator
    }
}
