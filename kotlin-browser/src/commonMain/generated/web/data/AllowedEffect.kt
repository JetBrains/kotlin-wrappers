// Automatically generated - do not modify!

package web.data

import seskar.js.JsValue

sealed external interface AllowedEffect {
    companion object {
        @JsValue("none")
        val none: AllowedEffect

        @JsValue("copy")
        val copy: AllowedEffect

        @JsValue("copyLink")
        val copyLink: AllowedEffect

        @JsValue("copyMove")
        val copyMove: AllowedEffect

        @JsValue("link")
        val link: AllowedEffect

        @JsValue("linkMove")
        val linkMove: AllowedEffect

        @JsValue("move")
        val move: AllowedEffect

        @JsValue("all")
        val all: AllowedEffect

        @JsValue("uninitialized")
        val uninitialized: AllowedEffect
    }
}
