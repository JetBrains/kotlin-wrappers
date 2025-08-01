// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents a collection of [inline completion items][InlineCompletionItem] to be presented
 * in the editor.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionList)
 */
open external class InlineCompletionList {
    /**
     * The inline completion items.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionList.items)
     */
    var items: ReadonlyArray<InlineCompletionItem>

    /**
     * Creates a new list of inline completion items.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionList.constructor)
     */
    constructor(items: ReadonlyArray<InlineCompletionItem>)
}
