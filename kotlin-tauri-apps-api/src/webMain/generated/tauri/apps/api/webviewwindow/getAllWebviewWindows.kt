// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/webviewWindow")

package tauri.apps.api.webviewwindow

/**
 * Gets a list of instances of `Webview` for all available webview windows.
 *
 * @remarks Uses the `core:window:allow-get-all-windows` permission, which is part
 * of `core:window:default`.
 *
 * @since 2.0.0
 */
external fun getAllWebviewWindows(): js.promise.Promise<js.array.ReadonlyArray<WebviewWindow>>
