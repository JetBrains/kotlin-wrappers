// Automatically generated - do not modify!

package tauri.apps.api.tray

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
