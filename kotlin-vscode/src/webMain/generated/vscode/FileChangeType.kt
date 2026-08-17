// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Enumeration of file change types.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileChangeType)
 */
/* enum */
external class FileChangeType
private constructor() {

    /**
     * The contents or metadata of a file have changed.
     */
    val Changed: FileChangeType // 1

    /**
     * A file has been created.
     */
    val Created: FileChangeType // 2

    /**
     * A file has been deleted.
     */
    val Deleted: FileChangeType // 3
}
