// Automatically generated - do not modify!

package web.cssom.atrule

import seskar.js.JsValue

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
