// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * Provides APIs to create windows, communicate with other windows and manipulate the current window.
 *
 * #### Window events
 *
 * Events can be listened to using {@link Window.listen}:
 * ```typescript
 * import { getCurrentWindow } from "@tauri-apps/api/window";
 * getCurrentWindow().listen("my-window-event", ({ event, payload }) => { });
 * ```
 *
 * This package is also accessible with `window.__TAURI__.window` when [`app.withGlobalTauri`](https://v2.tauri.app/reference/config/#withglobaltauri) in `tauri.conf.json` is set to `true`.
 *
 * @remarks `core:window:default` only enables the getters (sizes, positions,
 * monitors, title, theme and the `is*` queries). Creating a window and every
 * method that changes one needs its own permission, which each member documents,
 * added to a capability in your app.
 *
 * @module
 */

// export { Window, CloseRequestedEvent, getCurrentWindow, getAllWindows, LogicalSize, PhysicalSize, LogicalPosition, PhysicalPosition, UserAttentionType, Effect, EffectState, currentMonitor, monitorFromPoint, primaryMonitor, availableMonitors, cursorPosition };

// export type { Effects, Theme, TitleBarStyle, ScaleFactorChanged, WindowOptions, PreventOverflowMargin, Color, BackgroundThrottlingPolicy, DragDropEvent, ScrollBarStyle };
