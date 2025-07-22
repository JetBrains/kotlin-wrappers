// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * Represents a collection of {@link CompletionItem completion items} to be presented
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
//  constructor(items?: T[], isIncomplete?: boolean)
}
