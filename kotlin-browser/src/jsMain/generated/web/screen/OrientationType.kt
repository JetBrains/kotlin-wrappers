// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.screen

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface OrientationType {
    companion object {
        @JsValue("landscape-primary")
        val landscapePrimary: OrientationType

        @JsValue("landscape-secondary")
        val landscapeSecondary: OrientationType

        @JsValue("portrait-primary")
        val portraitPrimary: OrientationType

        @JsValue("portrait-secondary")
        val portraitSecondary: OrientationType
    }
}
