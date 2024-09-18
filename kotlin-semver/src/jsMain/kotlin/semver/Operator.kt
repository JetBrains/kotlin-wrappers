package semver

import seskar.js.JsValue

sealed external interface Operator {
    companion object {
        @JsValue("===")
        val strictEqual: Operator

        @JsValue("!==")
        val strictNotEqual: Operator

        @JsValue("")
        val empty: Operator

        @JsValue("=")
        val assign: Operator

        @JsValue("==")
        val equal: Operator

        @JsValue("!=")
        val notEqual: Operator

        @JsValue(">")
        val greater: Operator

        @JsValue(">=")
        val greaterEqual: Operator

        @JsValue("<")
        val less: Operator

        @JsValue("<=")
        val lessEqual: Operator
    }
}
