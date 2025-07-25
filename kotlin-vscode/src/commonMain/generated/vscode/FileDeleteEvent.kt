// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An event that is fired after files are deleted.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDeleteEvent)
 */
external interface FileDeleteEvent {
    /**
     * The files that got deleted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDeleteEvent.files)
     */
    val files: ReadonlyArray<Uri>
}
