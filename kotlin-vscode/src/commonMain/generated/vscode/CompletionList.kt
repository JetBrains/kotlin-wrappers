// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a collection of [completion items][CompletionItem] to be presented
 * in the editor.
 */
open external class CompletionList<T : CompletionItem> {
    /**
     * This list is not complete. Further typing should result in recomputing
     * this list.
     */
    var isIncomplete: Boolean?

    /**
     * The completion items.
     */
    var items: ReadonlyArray<T>

    /**
     * Creates a new completion list.
     *
     * @param items The completion items.
     * @param isIncomplete The list is not complete.
     */
    constructor(
        items: ReadonlyArray<T> = definedExternally,
        isIncomplete: Boolean = definedExternally,
    )
}
