// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents a file tree structure in a chat response.
 */
external interface ChatResponseFileTree {
    /**
     * The name of the file or directory.
     */
    var name: String

    /**
     * An array of child file trees, if the current file tree is a directory.
     */
    var children: ReadonlyArray<ChatResponseFileTree>?
}
