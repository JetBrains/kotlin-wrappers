// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/webviewWindow")

package tauri.apps.api.webviewwindow

/**
 * Create and manipulate windows that host a single webview.
 *
 * {@linkcode WebviewWindow} is the type you want for ordinary multi-window apps: it
 * mixes together the {@link Window} and {@link Webview} APIs, so one object exposes
 * both the window methods (`setTitle`, `maximize`, `close`, ...) and the webview
 * ones (`setZoom`, `clearAllBrowsingData`, ...).
 *
 * ```typescript
 * import { WebviewWindow } from '@tauri-apps/api/webviewWindow';
 *
 * const settings = new WebviewWindow('settings', {
 *   url: '/settings',
 *   title: 'Settings'
 * });
 * settings.once('tauri://created', () => console.log('window created'));
 * settings.once('tauri://error', (e) => console.error(e));
 * ```
 *
 * Unlike {@link Webview | child webviews}, this does **not** require the `unstable`
 * Cargo feature.
 *
 * This package is also accessible with `window.__TAURI__.webviewWindow` when [`app.withGlobalTauri`](https://v2.tauri.app/reference/config/#withglobaltauri) in `tauri.conf.json` is set to `true`.
 *
 * @remarks Creating a webview window requires the
 * `core:webview:allow-create-webview-window` permission, which is not included in
 * `core:webview:default`. The methods inherited from {@link Window} and
 * {@link Webview} each document their own permission.
 *
 * @module
 */

// export { WebviewWindow, getCurrentWebviewWindow, getAllWebviewWindows };

// export type { DragDropEvent, Color };
