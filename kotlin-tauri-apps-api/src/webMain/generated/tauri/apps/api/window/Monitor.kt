// Automatically generated - do not modify!

package tauri.apps.api.window

import tauri.apps.api.dpi.PhysicalPosition
import tauri.apps.api.dpi.PhysicalSize

/**
 * Allows you to retrieve information about a given monitor.
 *
 * @since 1.0.0
 */
external interface Monitor {
    /** Human-readable name of the monitor */
    var name: String?

    /**
     * The monitor's resolution in physical pixels.
     *
     * Use {@linkcode Monitor.scaleFactor} to convert to logical pixels:
     * ```typescript
     * const logicalSize = monitor.size.toLogical(monitor.scaleFactor);
     * ```
     */
    var size: PhysicalSize

    /**
     * the Top-left corner position of the monitor relative to the larger full screen area, in physical pixels.
     *
     * Note that window creation options such as `x`, `y`, `width` and `height` expect
     * logical pixels, so convert with {@linkcode Monitor.scaleFactor} first:
     * ```typescript
     * import { currentMonitor } from '@tauri-apps/api/window';
     * import { WebviewWindow } from '@tauri-apps/api/webviewWindow';
     *
     * const monitor = await currentMonitor();
     * if (monitor) {
     *   const position = monitor.position.toLogical(monitor.scaleFactor);
     *   const webview = new WebviewWindow('my-label', { x: position.x, y: position.y });
     * }
     * ```
     */
    var position: PhysicalPosition

    /**
     * The monitor's work area (the monitor area excluding taskbars and docks) in physical pixels.
     *
     * Use {@linkcode Monitor.scaleFactor} to convert to logical pixels as shown in
     * {@linkcode Monitor.position}.
     */
    var workArea: MonitorWorkArea

    /**
     * The scale factor that can be used to map physical pixels to logical pixels,
     * e.g. `monitor.position.toLogical(monitor.scaleFactor)`.
     */
    var scaleFactor: Double
}
