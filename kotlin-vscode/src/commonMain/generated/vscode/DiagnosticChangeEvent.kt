// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * The event that is fired when diagnostics change.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticChangeEvent)
 */
external interface DiagnosticChangeEvent {
    /**
     * An array of resources for which diagnostics have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticChangeEvent.uris)
     */
    val uris: ReadonlyArray<Uri>
}
