// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * Attention type to request on a window.
 *
 * @since 1.0.0
 */
sealed external interface UserAttentionType {
    companion object {
        /**
         * #### Platform-specific
         * - **macOS:** Bounces the dock icon until the application is in focus.
         * - **Windows:** Flashes both the window and the taskbar button until the application is in focus.
         */
        val Critical: UserAttentionType

        /**
         * #### Platform-specific
         * - **macOS:** Bounces the dock icon once.
         * - **Windows:** Flashes the taskbar button until the application is in focus.
         */
        val Informational: UserAttentionType
    }
}
