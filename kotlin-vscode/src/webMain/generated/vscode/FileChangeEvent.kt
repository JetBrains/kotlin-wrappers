// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * The event filesystem providers must use to signal a file change.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileChangeEvent)
 */
@JsPlainObject
external interface FileChangeEvent {
    /**
     * The type of change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileChangeEvent.type)
     */
    val type: FileChangeType

    /**
     * The uri of the file that has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileChangeEvent.uri)
     */
    val uri: Uri
}
