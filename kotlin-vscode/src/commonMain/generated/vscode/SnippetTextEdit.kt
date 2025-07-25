// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * A snippet edit represents an interactive edit that is performed by
 * the editor.
 *
 * *Note* that a snippet edit can always be performed as a normal [text edit][TextEdit].
 * This will happen when no matching editor is open or when a [workspace edit][WorkspaceEdit]
 * contains snippet edits for multiple files. In that case only those that match the active editor
 * will be performed as snippet edits and the others as normal text edits.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SnippetTextEdit)
 */
open external class SnippetTextEdit {
    /**
     * The range this edit applies to.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SnippetTextEdit.range)
     */
    var range: Range

    /**
     * The [snippet][SnippetString] this edit will perform.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SnippetTextEdit.snippet)
     */
    var snippet: SnippetString

    /**
     * Whether the snippet edit should be applied with existing whitespace preserved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SnippetTextEdit.keepWhitespace)
     */
    var keepWhitespace: Boolean?

    /**
     * Create a new snippet edit.
     *
     * @param range A range.
     * @param snippet A snippet string.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SnippetTextEdit.constructor)
     */
    constructor(
        range: Range,
        snippet: SnippetString,
    )

    companion object {
        /**
         * Utility to create a replace snippet edit.
         *
         * @param range A range.
         * @param snippet A snippet string.
         * @returns A new snippet edit object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SnippetTextEdit.replace)
         */
        fun replace(
            range: Range,
            snippet: SnippetString,
        ): SnippetTextEdit

        /**
         * Utility to create an insert snippet edit.
         *
         * @param position A position, will become an empty range.
         * @param snippet A snippet string.
         * @returns A new snippet edit object.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SnippetTextEdit.insert)
         */
        fun insert(
            position: Position,
            snippet: SnippetString,
        ): SnippetTextEdit
    }
}
