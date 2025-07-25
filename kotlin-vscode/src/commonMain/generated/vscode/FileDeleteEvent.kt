// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject

/**
 * An event that is fired after files are deleted.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDeleteEvent)
 */
@JsPlainObject
external interface FileDeleteEvent {
    /**
     * The files that got deleted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileDeleteEvent.files)
     */
    val files: ReadonlyArray<Uri>
}
