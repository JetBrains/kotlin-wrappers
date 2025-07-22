// Automatically generated - do not modify!

package vscode

/**
 * The rename provider interface defines the contract between extensions and
 * the [rename](https://code.visualstudio.com/docs/editor/editingevolved#_rename-symbol)-feature.
 */
external interface RenameProvider {
    /**
     * Provide an edit that describes changes that have to be made to one
     * or many resources to rename a symbol to a different name.
     *
     * @param document The document in which the command was invoked.
     * @param position The position at which the command was invoked.
     * @param newName The new name of the symbol. If the given name is not valid, the provider must return a rejected promise.
     * @param token A cancellation token.
     * @returns A workspace edit or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     */
//  provideRenameEdits(document: TextDocument, position: Position, newName: string, token: CancellationToken): ProviderResult<WorkspaceEdit>;

    /**
     * Optional function for resolving and validating a position *before* running rename. The result can
     * be a range or a range and a placeholder text. The placeholder text should be the identifier of the symbol
     * which is being renamed - when omitted the text in the returned range is used.
     *
     * *Note:* This function should throw an error or return a rejected thenable when the provided location
     * doesn't allow for a rename.
     *
     * @param document The document in which rename will be invoked.
     * @param position The position at which rename will be invoked.
     * @param token A cancellation token.
     * @returns The range or range and placeholder text of the identifier that is to be renamed. The lack of a result can signaled by returning `undefined` or `null`.
     */
    /*
    prepareRename?(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Range | {
        /**
         * The range of the identifier that can be renamed.
         */
        range: Range;
        /**
         * The placeholder of the editors rename input box.
         */
        placeholder: string;
    }>;
    */
}
