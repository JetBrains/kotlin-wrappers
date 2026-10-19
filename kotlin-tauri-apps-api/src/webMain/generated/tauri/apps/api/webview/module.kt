// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/webview")

package tauri.apps.api.webview

/**
 * Provides APIs to create webviews, communicate with other webviews and manipulate the current webview.
 *
 * #### Webview events
 *
 * Events can be listened to using {@link Webview.listen}:
 * ```typescript
 * import { getCurrentWebview } from "@tauri-apps/api/webview";
 * getCurrentWebview().listen("my-webview-event", ({ event, payload }) => { });
 * ```
 *
 * #### The `unstable` Cargo feature
 *
 * Creating *child webviews* — several webviews inside one window, via
 * {@link Webview | `new Webview(...)`} — is an unstable API. It requires the
 * `unstable` feature of the `tauri` crate:
 *
 * ```toml
 * [dependencies]
 * tauri = { version = "2", features = ["unstable"] }
 * ```
 *
 * Without it the `plugin:webview|create_webview` command returns an
 * "unstable feature not supported" error. Everything else in this module —
 * {@link getCurrentWebview}, {@link getAllWebviews} and the methods of an existing
 * webview — works without the feature, and so does
 * {@link WebviewWindow | `new WebviewWindow(...)`}, which creates a window with a
 * single webview.
 *
 * This package is also accessible with `window.__TAURI__.webview` when [`app.withGlobalTauri`](https://v2.tauri.app/reference/config/#withglobaltauri) in `tauri.conf.json` is set to `true`.
 *
 * @remarks `core:webview:default` only enables the getters
 * (`allow-get-all-webviews`, `allow-webview-position`, `allow-webview-size` and
 * `allow-internal-toggle-devtools`). Every other method documents the permission
 * it needs, which you must add to a capability yourself.
 *
 * @module
 */

/* export { Webview, getCurrentWebview, getAllWebviews }; */

/* export type { DragDropEvent, WebviewOptions, Color }; */
