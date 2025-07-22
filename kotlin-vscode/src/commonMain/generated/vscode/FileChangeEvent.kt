// Automatically generated - do not modify!

package vscode

/**
 * The event filesystem providers must use to signal a file change.
 */
external interface FileChangeEvent {
    /**
     * The type of change.
     */
    val type: FileChangeType

    /**
     * The uri of the file that has changed.
     */
    val uri: Uri
}
