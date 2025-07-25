// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * The event that is fired when diagnostics change.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticChangeEvent)
 */
@JsPlainObject
external interface DiagnosticChangeEvent {
    /**
     * An array of resources for which diagnostics have changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DiagnosticChangeEvent.uris)
     */
    val uris: ReadonlyArray<Uri>
}
