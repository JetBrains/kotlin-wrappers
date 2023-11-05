// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package webvtt

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ScrollSetting {
    companion object {
        @JsValue("")
        val none: ScrollSetting

        @JsValue("up")
        val up: ScrollSetting
    }
}
