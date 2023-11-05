// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface DisplayMode {
    companion object {
        @JsValue("fullscreen")
        val fullscreen: DisplayMode

        @JsValue("standalone")
        val standalone: DisplayMode

        @JsValue("minimal-ui")
        val minimalUi: DisplayMode

        @JsValue("browser")
        val browser: DisplayMode

        @JsValue("window-controls-overlay")
        val windowControlsOverlay: DisplayMode
    }
}
