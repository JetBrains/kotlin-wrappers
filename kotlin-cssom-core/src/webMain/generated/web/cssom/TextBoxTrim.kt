// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue

sealed external interface TextBoxTrim {
    companion object {
        @JsValue("trim-both")
        val trimBoth: TextBoxTrim

        @JsValue("trim-end")
        val trimEnd: TextBoxTrim

        @JsValue("trim-start")
        val trimStart: TextBoxTrim
    }
}
