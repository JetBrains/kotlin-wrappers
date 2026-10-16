// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/tray")

package tauri.apps.api.tray

/**
 * Create and manipulate system tray (menu bar / notification area) icons.
 *
 * Tray icons are created with {@linkcode TrayIcon.new} and live on the Rust side,
 * the frontend only holds a handle to them.
 *
 * This package is also accessible with `window.__TAURI__.tray` when [`app.withGlobalTauri`](https://v2.tauri.app/reference/config/#withglobaltauri) in `tauri.conf.json` is set to `true`.
 *
 * @remarks All commands used by this module are part of the `core:tray:default`
 * permission set, which is enabled by default, so no extra capability
 * configuration is needed. Loading an icon from a path or from bytes additionally
 * requires the `image-png` / `image-ico` Cargo features of the `tauri` crate.
 *
 * @module
 */
