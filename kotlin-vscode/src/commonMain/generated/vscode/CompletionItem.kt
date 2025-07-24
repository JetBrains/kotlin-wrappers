// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsString

/**
 * A completion item represents a text snippet that is proposed to complete text that is being typed.
 *
 * It is sufficient to create a completion item from just a {@link CompletionItem.label label}. In that
 * case the completion item will replace the {@link TextDocument.getWordRangeAtPosition word}
 * until the cursor with the given label or {@link CompletionItem.insertText insertText}. Otherwise the
 * given {@link CompletionItem.textEdit edit} is used.
 *
 * When selecting a completion item in the editor its defined or synthesized text edit will be applied
 * to *all* cursors/selections whereas {@link CompletionItem.additionalTextEdits additionalTextEdits} will be
 * applied as provided.
 *
 * @see {@link CompletionItemProvider.provideCompletionItems}
 * @see {@link CompletionItemProvider.resolveCompletionItem}
 */
open external class CompletionItem {
    /**
     * The label of this completion item. By default
     * this is also the text that is inserted when selecting
     * this completion.
     */
    var label: Any /* string | CompletionItemLabel */

    /**
     * The kind of this completion item. Based on the kind
     * an icon is chosen by the editor.
     */
    var kind: CompletionItemKind?

    /**
     * Tags for this completion item.
     */
    var tags: ReadonlyArray<CompletionItemTag>?

    /**
     * A human-readable string with additional information
     * about this item, like type or symbol information.
     */
    var detail: String?

    /**
     * A human-readable string that represents a doc-comment.
     */
    var documentation: Any /* string | MarkdownString */?

    /**
     * A string that should be used when comparing this item
     * with other items. When `falsy` the {@link CompletionItem.label label}
     * is used.
     *
     * Note that `sortText` is only used for the initial ordering of completion
     * items. When having a leading word (prefix) ordering is based on how
     * well completions match that prefix and the initial ordering is only used
     * when completions match equally well. The prefix is defined by the
     * {@linkcode CompletionItem.range range}-property and can therefore be different
     * for each completion.
     */
    var sortText: String?

    /**
     * A string that should be used when filtering a set of
     * completion items. When `falsy` the {@link CompletionItem.label label}
     * is used.
     *
     * Note that the filter text is matched against the leading word (prefix) which is defined
     * by the {@linkcode CompletionItem.range range}-property.
     */
    var filterText: String?

    /**
     * Select this item when showing. *Note* that only one completion item can be selected and
     * that the editor decides which item that is. The rule is that the *first* item of those
     * that match best is selected.
     */
    var preselect: Boolean?

    /**
     * A string or snippet that should be inserted in a document when selecting
     * this completion. When `falsy` the {@link CompletionItem.label label}
     * is used.
     */
    var insertText: Any /* string | SnippetString */?

    /**
     * A range or a insert and replace range selecting the text that should be replaced by this completion item.
     *
     * When omitted, the range of the {@link TextDocument.getWordRangeAtPosition current word} is used as replace-range
     * and as insert-range the start of the {@link TextDocument.getWordRangeAtPosition current word} to the
     * current position is used.
     *
     * *Note 1:* A range must be a {@link Range.isSingleLine single line} and it must
     * {@link Range.contains contain} the position at which completion has been {@link CompletionItemProvider.provideCompletionItems requested}.
     * *Note 2:* A insert range must be a prefix of a replace range, that means it must be contained and starting at the same position.
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
     */
    var commitCharacters: ReadonlyArray<JsString>?

    /**
     * Keep whitespace of the {@link CompletionItem.insertText insertText} as is. By default, the editor adjusts leading
     * whitespace of new lines so that they match the indentation of the line for which the item is accepted - setting
     * this to `true` will prevent that.
     */
    var keepWhitespace: Boolean?

    /**
     * An optional array of additional {@link TextEdit text edits} that are applied when
     * selecting this completion. Edits must not overlap with the main {@link CompletionItem.textEdit edit}
     * nor with themselves.
     */
    var additionalTextEdits: ReadonlyArray<TextEdit>?

    /**
     * An optional {@link Command} that is executed *after* inserting this completion. *Note* that
     * additional modifications to the current document should be described with the
     * {@link CompletionItem.additionalTextEdits additionalTextEdits}-property.
     */
    var command: Command?

    /**
     * Creates a new completion item.
     *
     * Completion items must have at least a {@link CompletionItem.label label} which then
     * will be used as insert text as well as for sorting and filtering.
     *
     * @param label The label of the completion.
     * @param kind The {@link CompletionItemKind kind} of the completion.
     */
    constructor(
        label: Any, /* string | CompletionItemLabel */
        kind: CompletionItemKind = definedExternally,
    )
}
