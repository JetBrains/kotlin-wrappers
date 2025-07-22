// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * Represents a part of a chat response that is a file tree.
 */
open external class ChatResponseFileTreePart {
    /**
     * File tree data.
     */
    var value: ReadonlyArray<ChatResponseFileTree>

    /**
     * The base uri to which this file tree is relative
     */
    var baseUri: Uri

    /**
     * Create a new ChatResponseFileTreePart.
     * @param value File tree data.
     * @param baseUri The base uri to which this file tree is relative.
     */
    constructor(
        value: ReadonlyArray<ChatResponseFileTree>,
        baseUri: Uri,
    )
}
