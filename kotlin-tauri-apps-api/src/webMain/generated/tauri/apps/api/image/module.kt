// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/image")

package tauri.apps.api.image

/**
 * Load and inspect images to use as window icons, tray icons and menu item icons.
 *
 * Images live on the Rust side (they extend {@linkcode Resource}), the frontend only
 * holds a handle to them. Call `close()` when an image is no longer needed, or let
 * it be released when the app exits.
 *
 * @remarks {@linkcode Image.fromPath} and {@linkcode Image.fromBytes} decode PNG and ICO
 * files, which requires the `image-png` and/or `image-ico` Cargo features of the
 * `tauri` crate:
 * ```toml
 * [dependencies]
 * tauri = { version = "2", features = ["image-png"] }
 * ```
 * {@linkcode Image.new} takes raw RGBA data and needs no extra feature.
 *
 * @remarks All commands used by this module are part of the `core:image:default`
 * permission set, which is enabled by default.
 *
 * This package is also accessible with `window.__TAURI__.image` when [`app.withGlobalTauri`](https://v2.tauri.app/reference/config/#withglobaltauri) in `tauri.conf.json` is set to `true`.
 *
 * @module
 */
