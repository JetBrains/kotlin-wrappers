// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/dpi")

package tauri.apps.api.dpi

/**
 * Size and position types for working with logical and physical pixels.
 *
 * Window and webview APIs report sizes and positions in **physical pixels** (actual
 * screen pixels), while most browser APIs and the window creation options use
 * **logical pixels** (physical pixels divided by the monitor scale factor). The
 * classes in this module make the unit explicit and convert between the two.
 *
 * ```typescript
 * import { getCurrentWindow } from '@tauri-apps/api/window';
 *
 * const appWindow = getCurrentWindow();
 * const size = await appWindow.innerSize(); // PhysicalSize
 * const logical = size.toLogical(await appWindow.scaleFactor());
 * ```
 *
 * They also serialize into the shape `tauri::Size` / `tauri::Position` expect, so
 * they can be passed straight to your own commands, see {@linkcode Size} and
 * {@linkcode Position}.
 *
 * This package is also accessible with `window.__TAURI__.dpi` when [`app.withGlobalTauri`](https://v2.tauri.app/reference/config/#withglobaltauri) in `tauri.conf.json` is set to `true`.
 *
 * @module
 */

// export { LogicalPosition, LogicalSize, Size, PhysicalPosition, PhysicalSize, Position };
