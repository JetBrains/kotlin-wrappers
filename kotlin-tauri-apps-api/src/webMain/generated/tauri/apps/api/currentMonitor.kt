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
 * Returns the monitor on which the window currently resides.
 * Returns `null` if current monitor can't be detected.
 * @example
 * ```typescript
 * import { currentMonitor } from '@tauri-apps/api/window';
 * const monitor = await currentMonitor();
 * ```
 *
 * @since 1.0.0
 */
external fun currentMonitor(): js.promise.Promise<Monitor?>
