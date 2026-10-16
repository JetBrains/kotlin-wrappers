// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/window")

package tauri.apps.api.window

/**
 * The state of the taskbar/dock progress bar, see {@link Window.setProgressBar}.
 *
 * @since 2.0.0
 */
sealed external interface ProgressBarStatus {
    companion object {
        /**
         * Hide progress bar.
         */
        val None: ProgressBarStatus

        /**
         * Normal state.
         */
        val Normal: ProgressBarStatus

        /**
         * Indeterminate state. **Treated as Normal on Linux and macOS**
         */
        val Indeterminate: ProgressBarStatus

        /**
         * Paused state. **Treated as Normal on Linux**
         */
        val Paused: ProgressBarStatus

        /**
         * Error state. **Treated as Normal on linux**
         */
        val Error: ProgressBarStatus
    }
}
