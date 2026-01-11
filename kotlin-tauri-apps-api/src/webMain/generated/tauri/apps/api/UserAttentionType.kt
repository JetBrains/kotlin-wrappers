// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

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

/**
 * Attention type to request on a window.
 *
 * @since 1.0.0
 */
sealed external interface UserAttentionType {
    companion object {
        /**
         * #### Platform-specific
         * - **macOS:** Bounces the dock icon until the application is in focus.
         * - **Windows:** Flashes both the window and the taskbar button until the application is in focus.
         */
        val Critical: UserAttentionType

        /**
         * #### Platform-specific
         * - **macOS:** Bounces the dock icon once.
         * - **Windows:** Flashes the taskbar button until the application is in focus.
         */
        val Informational: UserAttentionType
    }
}
