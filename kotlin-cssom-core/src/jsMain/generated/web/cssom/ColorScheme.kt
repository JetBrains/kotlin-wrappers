// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ColorScheme {
    companion object {
        @JsValue("dark")
        val dark: ColorScheme

        @JsValue("light")
        val light: ColorScheme

        @JsValue("normal")
        val normal: ColorScheme
    }
}
