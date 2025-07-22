// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents a collection of {@link CompletionItem completion items} to be presented
 * in the editor.
 */
open external class CompletionList<T : CompletionItem> {
    /**
    // ORIGINAL SOURCE


    /**
     * This list is not complete. Further typing should result in recomputing
     * this list.
    */
    isIncomplete?: boolean;

    /**
     * The completion items.
    */
    items: T[];

    /**
     * Creates a new completion list.
     *
     * @param items The completion items.
     * @param isIncomplete The list is not complete.
    */
    constructor(items?: T[], isIncomplete?: boolean);

    // ORIGINAL SOURCE
     **/
}
