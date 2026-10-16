// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * Gets a list of instances of `Window` for all available windows.
 *
 * @remarks Uses the `core:window:allow-get-all-windows` permission, which is part
 * of `core:window:default`.
 *
 * @since 1.0.0
 */
external fun getAllWindows(): js.promise.Promise<js.array.ReadonlyArray<Window>>
