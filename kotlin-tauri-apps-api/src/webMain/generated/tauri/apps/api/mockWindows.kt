// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api

// unhandled import: InvokeArgs from "./core"

/**
 * Mocks one or many window labels.
 * In non-tauri context it is required to call this function *before* using the `@tauri-apps/api/window` module.
 *
 * This function only mocks the *presence* of windows,
 * window properties (e.g. width and height) can be mocked like regular IPC calls using the `mockIPC` function.
 *
 * # Examples
 *
 * ```js
 * import { mockWindows } from "@tauri-apps/api/mocks";
 * import { getCurrentWindow } from "@tauri-apps/api/window";
 *
 * mockWindows("main", "second", "third");
 *
 * const win = getCurrentWindow();
 *
 * win.label // "main"
 * ```
 *
 * ```js
 * import { mockWindows } from "@tauri-apps/api/mocks";
 *
 * mockWindows("main", "second", "third");
 *
 * mockIPC((cmd, args) => {
 *  if (cmd === "plugin:event|emit") {
 *    console.log('emit event', args?.event, args?.payload);
 *  }
 * });
 *
 * const { emit } = await import("@tauri-apps/api/event");
 * await emit('loaded'); // this will cause the mocked IPC handler to log to the console.
 * ```
 *
 * @param current Label of window this JavaScript context is running in.
 *
 * @since 1.0.0
 */
external fun mockWindows(
    current: String,
    vararg _additionalWindows: String,
)
