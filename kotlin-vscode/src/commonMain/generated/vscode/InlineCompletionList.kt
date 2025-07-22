// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * Represents a collection of {@link InlineCompletionItem inline completion items} to be presented
 * in the editor.
 */
open external class InlineCompletionList {
    /**
     * The inline completion items.
     */
    var items: ReadonlyArray<InlineCompletionItem>

    /**
     * Creates a new list of inline completion items.
     */
    constructor(items: ReadonlyArray<InlineCompletionItem>)
}
