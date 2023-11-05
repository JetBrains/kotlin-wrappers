// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface MarginTrim {
    companion object {
        @JsValue("all")
        val all: MarginTrim

        @JsValue("in-flow")
        val inFlow: MarginTrim
    }
}
