// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * An event that is fired after files are created.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCreateEvent)
 */
@JsPlainObject
external interface FileCreateEvent {
    /**
     * The files that got created.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileCreateEvent.files)
     */
    val files: ReadonlyArray<Uri>
}
