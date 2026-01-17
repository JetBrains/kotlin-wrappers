// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/core")

package tauri.apps.api.core

/**
 * Stores the callback in a known location, and returns an identifier that can be passed to the backend.
 * The backend uses the identifier to `eval()` the callback.
 *
 * @return An unique identifier associated with the callback function.
 *
 * @since 1.0.0
 */
external fun <T /* default is Any? */> transformCallback(
    callback: (response: T) -> Unit = definedExternally,
    once: Boolean = definedExternally,
): Double
