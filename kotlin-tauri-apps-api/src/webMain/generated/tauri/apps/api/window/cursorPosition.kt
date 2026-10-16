// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

import tauri.apps.api.dpi.PhysicalPosition

/**
 * Get the cursor position relative to the top-left hand corner of the desktop.
 *
 * Note that the top-left hand corner of the desktop is not necessarily the same as the screen.
 * If the user uses a desktop with multiple monitors,
 * the top-left hand corner of the desktop is the top-left hand corner of the main monitor on Windows and macOS
 * or the top-left of the leftmost monitor on X11.
 *
 * The coordinates can be negative if the top-left hand corner of the window is outside of the visible screen region.
 *
 * @example
 * ```typescript
 * import { cursorPosition } from '@tauri-apps/api/window';
 * const position = await cursorPosition();
 * console.log(position.x, position.y);
 * ```
 *
 * @returns The cursor position, in physical pixels.
 *
 * @remarks Uses the `core:window:allow-cursor-position` permission, which is part
 * of `core:window:default`.
 *
 * @since 2.0.0
 */
external fun cursorPosition(): js.promise.Promise<PhysicalPosition>
