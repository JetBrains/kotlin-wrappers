// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: Menu from "./menu"
// unhandled import: Submenu from "./menu"
// unhandled import: Resource from "./core"
// unhandled import: Image from "./image"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"

sealed external interface TrayIconEventType {
    companion object {
        @seskar.js.JsValue("Click")
        val Click: TrayIconEventType

        @seskar.js.JsValue("DoubleClick")
        val DoubleClick: TrayIconEventType

        @seskar.js.JsValue("Enter")
        val Enter: TrayIconEventType

        @seskar.js.JsValue("Move")
        val Move: TrayIconEventType

        @seskar.js.JsValue("Leave")
        val Leave: TrayIconEventType
    }
}
