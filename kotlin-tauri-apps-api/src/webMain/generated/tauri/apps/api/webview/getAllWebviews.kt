// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/webview")

package tauri.apps.api.webview

/**
 * Gets a list of instances of `Webview` for all available webviews.
 *
 * @remarks Uses the `core:webview:allow-get-all-webviews` permission, which is part
 * of `core:webview:default`.
 *
 * @since 2.0.0
 */
external fun getAllWebviews(): js.promise.Promise<js.array.ReadonlyArray<Webview>>
