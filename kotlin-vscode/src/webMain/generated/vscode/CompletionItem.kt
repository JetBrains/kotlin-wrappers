// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * A completion item represents a text snippet that is proposed to complete text that is being typed.
 *
 * It is sufficient to create a completion item from just a [label][CompletionItem.label]. In that
 * case the completion item will replace the [word][TextDocument.getWordRangeAtPosition]
 * until the cursor with the given label or [insertText][CompletionItem.insertText]. Otherwise the
 * given [edit][CompletionItem.textEdit] is used.
 *
 * When selecting a completion item in the editor its defined or synthesized text edit will be applied
 * to *all* cursors/selections whereas [additionalTextEdits][CompletionItem.additionalTextEdits] will be
 * applied as provided.
 *
 * @see [CompletionItemProvider.provideCompletionItems]
 * @see [CompletionItemProvider.resolveCompletionItem]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem)
 */
open external class CompletionItem {
    /**
     * The label of this completion item. By default
     * this is also the text that is inserted when selecting
     * this completion.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.label)
     */
    var label: JsAny /* string | CompletionItemLabel */

    /**
     * The kind of this completion item. Based on the kind
     * an icon is chosen by the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.kind)
     */
    var kind: CompletionItemKind?

    /**
     * Tags for this completion item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.tags)
     */
    var tags: ReadonlyArray<CompletionItemTag>?

    /**
     * A human-readable string with additional information
     * about this item, like type or symbol information.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.detail)
     */
    var detail: String?

    /**
     * A human-readable string that represents a doc-comment.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.documentation)
     */
    var documentation: JsAny /* string | MarkdownString */?

    /**
     * A string that should be used when comparing this item
     * with other items. When `falsy` the [label][CompletionItem.label]
     * is used.
     *
     * Note that `sortText` is only used for the initial ordering of completion
     * items. When having a leading word (prefix) ordering is based on how
     * well completions match that prefix and the initial ordering is only used
     * when completions match equally well. The prefix is defined by the
     * {@linkcode CompletionItem.range range}-property and can therefore be different
     * for each completion.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.sortText)
     */
    var sortText: String?

    /**
     * A string that should be used when filtering a set of
     * completion items. When `falsy` the [label][CompletionItem.label]
     * is used.
     *
     * Note that the filter text is matched against the leading word (prefix) which is defined
     * by the {@linkcode CompletionItem.range range}-property.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.filterText)
     */
    var filterText: String?

    /**
     * Select this item when showing. *Note* that only one completion item can be selected and
     * that the editor decides which item that is. The rule is that the *first* item of those
     * that match best is selected.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.preselect)
     */
    var preselect: Boolean?

    /**
     * A string or snippet that should be inserted in a document when selecting
     * this completion. When `falsy` the [label][CompletionItem.label]
     * is used.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.insertText)
     */
    var insertText: JsAny /* string | SnippetString */?

    /**
     * A range or a insert and replace range selecting the text that should be replaced by this completion item.
     *
     * When omitted, the range of the [current word][TextDocument.getWordRangeAtPosition] is used as replace-range
     * and as insert-range the start of the [current word][TextDocument.getWordRangeAtPosition] to the
     * current position is used.
     *
     * *Note 1:* A range must be a [single line][Range.isSingleLine] and it must
     * [contain} the position at which completion has been {@link CompletionItemProvider.provideCompletionItems requested][Range.contains].
     * *Note 2:* A insert range must be a prefix of a replace range, that means it must be contained and starting at the same position.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.range)
     */
    /*
    range?: Range | {
        /**
         * The range that should be used when insert-accepting a completion. Must be a prefix of `replaceRange`.
         */
        inserting: Range;
        /**
         * The range that should be used when replace-accepting a completion.
         */
        replacing: Range;
    }
    */

    /**
     * An optional set of characters that when pressed while this completion is active will accept it first and
     * then type that character. *Note* that all commit characters should have `length=1` and that superfluous
     * characters will be ignored.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.commitCharacters)
     */
    var commitCharacters: ReadonlyArray<JsString>?

    /**
     * Keep whitespace of the [insertText][CompletionItem.insertText] as is. By default, the editor adjusts leading
     * whitespace of new lines so that they match the indentation of the line for which the item is accepted - setting
     * this to `true` will prevent that.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.keepWhitespace)
     */
    var keepWhitespace: Boolean?

    /**
     * An optional array of additional [text edits][TextEdit] that are applied when
     * selecting this completion. Edits must not overlap with the main [edit][CompletionItem.textEdit]
     * nor with themselves.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.additionalTextEdits)
     */
    var additionalTextEdits: ReadonlyArray<TextEdit>?

    /**
     * An optional [Command] that is executed *after* inserting this completion. *Note* that
     * additional modifications to the current document should be described with the
     * [additionalTextEdits][CompletionItem.additionalTextEdits]-property.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.command)
     */
    var command: Command?

    /**
     * Creates a new completion item.
     *
     * Completion items must have at least a [label][CompletionItem.label] which then
     * will be used as insert text as well as for sorting and filtering.
     *
     * @param label The label of the completion.
     * @param kind The [kind][CompletionItemKind] of the completion.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItem.constructor)
     */
    constructor(
        label: String,
        kind: CompletionItemKind = definedExternally,
    )

    constructor(
        label: CompletionItemLabel,
        kind: CompletionItemKind = definedExternally,
    )
}
