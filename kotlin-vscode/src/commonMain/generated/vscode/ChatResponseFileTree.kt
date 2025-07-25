// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Represents a file tree structure in a chat response.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseFileTree)
 */
external interface ChatResponseFileTree {
    /**
     * The name of the file or directory.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseFileTree.name)
     */
    var name: String

    /**
     * An array of child file trees, if the current file tree is a directory.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseFileTree.children)
     */
    var children: ReadonlyArray<ChatResponseFileTree>?
}
