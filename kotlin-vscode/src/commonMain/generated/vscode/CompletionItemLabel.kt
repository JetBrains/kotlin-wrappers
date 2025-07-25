// Automatically generated - do not modify!

package vscode

/**
 * A structured label for a [completion item][CompletionItem].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItemLabel)
 */
external interface CompletionItemLabel {
    /**
     * The label of this completion item.
     *
     * By default this is also the text that is inserted when this completion is selected.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItemLabel.label)
     */
    var label: String

    /**
     * An optional string which is rendered less prominently directly after [label][CompletionItemLabel.label],
     * without any spacing. Should be used for function signatures or type annotations.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItemLabel.detail)
     */
    var detail: String?

    /**
     * An optional string which is rendered less prominently after [CompletionItemLabel.detail]. Should be used
     * for fully qualified names or file path.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItemLabel.description)
     */
    var description: String?
}
