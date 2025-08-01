// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents a part of a chat response that is a file tree.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseFileTreePart)
 */
open external class ChatResponseFileTreePart {
    /**
     * File tree data.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseFileTreePart.value)
     */
    var value: ReadonlyArray<ChatResponseFileTree>

    /**
     * The base uri to which this file tree is relative
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseFileTreePart.baseUri)
     */
    var baseUri: Uri

    /**
     * Create a new ChatResponseFileTreePart.
     * @param value File tree data.
     * @param baseUri The base uri to which this file tree is relative.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseFileTreePart.constructor)
     */
    constructor(
        value: ReadonlyArray<ChatResponseFileTree>,
        baseUri: Uri,
    )
}
