// Automatically generated - do not modify!

package tauri.apps.api

// unhandled import: LogicalPosition from "./dpi"
// unhandled import: LogicalSize from "./dpi"
// unhandled import: PhysicalPosition from "./dpi"
// unhandled import: PhysicalSize from "./dpi"
// unhandled import: Position from "./dpi"
// unhandled import: Size from "./dpi"
// unhandled import: Event from "./event"
// unhandled import: EventName from "./event"
// unhandled import: EventCallback from "./event"
// unhandled import: UnlistenFn from "./event"
// unhandled import: EventTarget from "./event"
// unhandled import: WebviewWindow from "./webviewWindow"
// unhandled import: DragDropEvent from "./webview"
// unhandled import: Image from "./image"

sealed external interface TitleBarStyle {
    companion object {
        @seskar.js.JsValue("visible")
        val visible: TitleBarStyle

        @seskar.js.JsValue("transparent")
        val transparent: TitleBarStyle

        @seskar.js.JsValue("overlay")
        val overlay: TitleBarStyle
    }
}
