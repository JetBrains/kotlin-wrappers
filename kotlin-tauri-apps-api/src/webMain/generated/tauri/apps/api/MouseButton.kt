// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: Menu from "./menu"
// unhandled import: Submenu from "./menu"
// unhandled import: Resource from "./core"
// unhandled import: Image from "./image"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"

sealed external interface MouseButton {
    companion object {
        @seskar.js.JsValue("Left")
        val Left: MouseButton

        @seskar.js.JsValue("Right")
        val Right: MouseButton

        @seskar.js.JsValue("Middle")
        val Middle: MouseButton
    }
}
