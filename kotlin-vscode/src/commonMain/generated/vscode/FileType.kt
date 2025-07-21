// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Enumeration of file types. The types `File` and `Directory` can also be
 * a symbolic links, in that case use `FileType.File | FileType.SymbolicLink` and
 * `FileType.Directory | FileType.SymbolicLink`.
 */
sealed /* enum */
external interface FileType {
    companion object {
        /**
         * The file type is unknown.
         */
        val Unknown: FileType // 0

        /**
         * A regular file.
         */
        val File: FileType // 1

        /**
         * A directory.
         */
        val Directory: FileType // 2

        /**
         * A symbolic link to a file.
         */
        val SymbolicLink: FileType // 64
    }
}
