// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
