// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.data

import seskar.js.JsValue

sealed external interface DropEffect {
    companion object {
        @JsValue("none")
        val none: DropEffect

        @JsValue("copy")
        val copy: DropEffect

        @JsValue("link")
        val link: DropEffect

        @JsValue("move")
        val move: DropEffect
    }
}
