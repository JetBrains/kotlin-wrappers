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
 * The scrollbar style to use in the webview.
 *
 * ## Platform-specific
 *
 * **Windows**: This option must be given the same value for all webviews.
 *
 * @since 2.8.0
 */
sealed external interface ScrollBarStyle {
    companion object {
        /**
         * The default scrollbar style for the webview.
         */
        val Default: ScrollBarStyle

        /**
         * Fluent UI style overlay scrollbars. **Windows Only**
         *
         * Requires WebView2 Runtime version 125.0.2535.41 or higher, does nothing on older versions,
         * see https://learn.microsoft.com/en-us/microsoft-edge/webview2/release-notes/?tabs=dotnetcsharp#10253541
         */
        val FluentOverlay: ScrollBarStyle
    }
}
