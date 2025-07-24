// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * A location in the editor at which progress information can be shown. It depends on the
 * location how progress is visually represented.
 */
sealed /* enum */
external interface ProgressLocation {
    companion object {
        /**
         * Show progress for the source control viewlet, as overlay for the icon and as progress bar
         * inside the viewlet (when visible). Neither supports cancellation nor discrete progress nor
         * a label to describe the operation.
         */
        val SourceControl: ProgressLocation // 1

        /**
         * Show progress in the status bar of the editor. Neither supports cancellation nor discrete progress.
         * Supports rendering of {@link ThemeIcon theme icons} via the `$(<name>)`-syntax in the progress label.
         */
        val Window: ProgressLocation // 10

        /**
         * Show progress as notification with an optional cancel button. Supports to show infinite and discrete
         * progress but does not support rendering of icons.
         */
        val Notification: ProgressLocation // 15
    }
}
