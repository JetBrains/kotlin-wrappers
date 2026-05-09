// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Enumeration of file change types.
 */
sealed /* enum */
external interface FileChangeType {
    companion object {
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
}
