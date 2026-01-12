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
 * Get the cursor position relative to the top-left hand corner of the desktop.
 *
 * Note that the top-left hand corner of the desktop is not necessarily the same as the screen.
 * If the user uses a desktop with multiple monitors,
 * the top-left hand corner of the desktop is the top-left hand corner of the main monitor on Windows and macOS
 * or the top-left of the leftmost monitor on X11.
 *
 * The coordinates can be negative if the top-left hand corner of the window is outside of the visible screen region.
 */
external fun cursorPosition(): js.promise.Promise<PhysicalPosition>
