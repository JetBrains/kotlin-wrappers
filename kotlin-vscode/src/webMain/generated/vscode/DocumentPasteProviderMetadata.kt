// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsString

/**
 * Provides additional metadata about how a {@linkcode DocumentPasteEditProvider} works.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteProviderMetadata)
 */
@JsPlainObject
external interface DocumentPasteProviderMetadata {
    /**
     * List of [kinds} that the provider may return in {@linkcode DocumentPasteEditProvider.provideDocumentPasteEdits provideDocumentPasteEdits][DocumentDropOrPasteEditKind].
     *
     * This is used to filter out providers when a specific [kind][DocumentDropOrPasteEditKind] of edit is requested.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteProviderMetadata.providedPasteEditKinds)
     */
    val providedPasteEditKinds: ReadonlyArray<DocumentDropOrPasteEditKind>

    /**
     * Mime types that {@linkcode DocumentPasteEditProvider.prepareDocumentPaste prepareDocumentPaste} may add on copy.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteProviderMetadata.copyMimeTypes)
     */
    val copyMimeTypes: ReadonlyArray<JsString>?

    /**
     * Mime types that {@linkcode DocumentPasteEditProvider.provideDocumentPasteEdits provideDocumentPasteEdits} should be invoked for.
     *
     * This can either be an exact mime type such as `image/png`, or a wildcard pattern such as `image/​*`.
     *
     * Use `text/uri-list` for resources dropped from the explorer or other tree views in the workbench.
     *
     * Use `files` to indicate that the provider should be invoked if any [files} are present in the {@linkcode DataTransfer][DataTransferFile].
     * Note that {@linkcode DataTransferFile} entries are only created when pasting content from outside the editor, such as
     * from the operating system.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentPasteProviderMetadata.pasteMimeTypes)
     */
    val pasteMimeTypes: ReadonlyArray<JsString>?
}
