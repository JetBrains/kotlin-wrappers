// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontPalette {
    companion object {
        @JsValue("dark")
        val dark: FontPalette

        @JsValue("light")
        val light: FontPalette

        @JsValue("normal")
        val normal: FontPalette
    }
}
