// Automatically generated - do not modify!

package tauri.apps.api.window

/**
 * The taskbar/dock progress indicator state, see {@link Window.setProgressBar}.
 *
 * @since 2.0.0
 */
external interface ProgressBarState {
    /**
     * The progress bar status.
     */
    var status: ProgressBarStatus?

    /**
     * The progress bar progress. This can be a value ranging from `0` to `100`
     */
    var progress: Double?
}
