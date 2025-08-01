// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents a collection of [completion items][CompletionItem] to be presented
 * in the editor.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionList)
 */
open external class CompletionList<T : CompletionItem> {
    /**
     * This list is not complete. Further typing should result in recomputing
     * this list.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionList.isIncomplete)
     */
    var isIncomplete: Boolean?

    /**
     * The completion items.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionList.items)
     */
    var items: ReadonlyArray<T>

    /**
     * Creates a new completion list.
     *
     * @param items The completion items.
     * @param isIncomplete The list is not complete.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionList.constructor)
     */
    constructor(
        items: ReadonlyArray<T> = definedExternally,
        isIncomplete: Boolean = definedExternally,
    )
}
