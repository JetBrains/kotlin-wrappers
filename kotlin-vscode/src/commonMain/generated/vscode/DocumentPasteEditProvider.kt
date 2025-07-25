// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.objects.JsPlainObject
import js.promise.PromiseLike

/**
 * Provider invoked when the user copies or pastes in a {@linkcode TextDocument}.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEditProvider)
 */
@JsPlainObject
external interface DocumentPasteEditProvider<T : DocumentPasteEdit> {
    /**
     * Optional method invoked after the user copies from a [text editor][TextEditor].
     *
     * This allows the provider to attach metadata about the copied text to the [DataTransfer]. This data
     * transfer is then passed back to providers in {@linkcode provideDocumentPasteEdits}.
     *
     * Note that currently any changes to the {@linkcode DataTransfer} are isolated to the current editor window.
     * This means that any added metadata cannot be seen by other editor windows or by other applications.
     *
     * @param document Text document where the copy took place.
     * @param ranges Ranges being copied in {@linkcode document}.
     * @param dataTransfer The data transfer associated with the copy. You can store additional values on this for
     * later use in {@linkcode provideDocumentPasteEdits}. This object is only valid for the duration of this method.
     * @param token A cancellation token.
     *
     * @return Optional thenable that resolves when all changes to the `dataTransfer` are complete.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEditProvider.prepareDocumentPaste)
     */
    var prepareDocumentPaste: ((
        document: TextDocument,
        ranges: ReadonlyArray<Range>,
        dataTransfer: DataTransfer,
        token: CancellationToken,
    ) -> PromiseLike<Void>?)?

    /**
     * Invoked before the user pastes into a [text editor][TextEditor].
     *
     * Returned edits can replace the standard pasting behavior.
     *
     * @param document Document being pasted into
     * @param ranges Range in the {@linkcode document} to paste into.
     * @param dataTransfer The [data transfer][DataTransfer] associated with the paste. This object is only
     * valid for the duration of the paste operation.
     * @param context Additional context for the paste.
     * @param token A cancellation token.
     *
     * @return Set of potential [edits][DocumentPasteEdit] that can apply the paste. Only a single returned
     * {@linkcode DocumentPasteEdit} is applied at a time. If multiple edits are returned from all providers, then
     * the first is automatically applied and a widget is shown that lets the user switch to the other edits.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEditProvider.provideDocumentPasteEdits)
     */
    var provideDocumentPasteEdits: ((
        document: TextDocument,
        ranges: ReadonlyArray<Range>,
        dataTransfer: DataTransfer,
        context: DocumentPasteEditContext,
        token: CancellationToken,
    ) -> ProviderResult<ReadonlyArray<T>>)?

    /**
     * Optional method which fills in the {@linkcode DocumentPasteEdit.additionalEdit} before the edit is applied.
     *
     * This is called once per edit and should be used if generating the complete edit may take a long time.
     * Resolve can only be used to change {@linkcode DocumentPasteEdit.insertText} or {@linkcode DocumentPasteEdit.additionalEdit}.
     *
     * @param pasteEdit The {@linkcode DocumentPasteEdit} to resolve.
     * @param token A cancellation token.
     *
     * @returns The resolved paste edit or a thenable that resolves to such. It is OK to return the given
     * `pasteEdit`. If no result is returned, the given `pasteEdit` is used.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteEditProvider.resolveDocumentPasteEdit)
     */
    var resolveDocumentPasteEdit: ((
        pasteEdit: T,
        token: CancellationToken,
    ) -> ProviderResult<T>)?
}
