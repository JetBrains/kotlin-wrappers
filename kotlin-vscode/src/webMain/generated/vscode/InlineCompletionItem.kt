// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * An inline completion item represents a text snippet that is proposed inline to complete text that is being typed.
 *
 * @see [InlineCompletionItemProvider.provideInlineCompletionItems]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionItem)
 */
open external class InlineCompletionItem {
    /**
     * The text to replace the range with. Must be set.
     * Is used both for the preview and the accept operation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionItem.insertText)
     */
    var insertText: JsAny /* string | SnippetString */

    /**
     * A text that is used to decide if this inline completion should be shown. When `falsy`
     * the [InlineCompletionItem.insertText] is used.
     *
     * An inline completion is shown if the text to replace is a prefix of the filter text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionItem.filterText)
     */
    var filterText: String?

    /**
     * The range to replace.
     * Must begin and end on the same line.
     *
     * Prefer replacements over insertions to provide a better experience when the user deletes typed text.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionItem.range)
     */
    var range: Range?

    /**
     * An optional [Command] that is executed *after* inserting this completion.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionItem.command)
     */
    var command: Command?

    /**
     * Creates a new inline completion item.
     *
     * @param insertText The text to replace the range with.
     * @param range The range to replace. If not set, the word at the requested position will be used.
     * @param command An optional [Command] that is executed *after* inserting this completion.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlineCompletionItem.constructor)
     */
    constructor(
        insertText: JsAny, /* string | SnippetString */
        range: Range = definedExternally,
        command: Command = definedExternally,
    )
}
