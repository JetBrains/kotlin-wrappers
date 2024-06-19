package js.symbol

import seskar.js.JsValue

sealed external interface PrimitiveHint {
    companion object {
        @JsValue("number")
        val number: PrimitiveHint

        @JsValue("string")
        val string: PrimitiveHint

        @JsValue("default")
        val default: PrimitiveHint
    }
}
