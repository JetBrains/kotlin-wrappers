// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import kotlin.js.JsString

/**
 * Provides additional metadata about how a {@linkcode DocumentDropEditProvider} works.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEditProviderMetadata)
 */
@JsPlainObject
external interface DocumentDropEditProviderMetadata {
    /**
     * List of [kinds} that the provider may return in {@linkcode DocumentDropEditProvider.provideDocumentDropEdits provideDocumentDropEdits][DocumentDropOrPasteEditKind].
     *
     * This is used to filter out providers when a specific [kind][DocumentDropOrPasteEditKind] of edit is requested.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEditProviderMetadata.providedDropEditKinds)
     */
    val providedDropEditKinds: ReadonlyArray<DocumentDropOrPasteEditKind>?

    /**
     * List of [DataTransfer] mime types that the provider can handle.
     *
     * This can either be an exact mime type such as `image/png`, or a wildcard pattern such as `image/​*`.
     *
     * Use `text/uri-list` for resources dropped from the explorer or other tree views in the workbench.
     *
     * Use `files` to indicate that the provider should be invoked if any [files][DataTransferFile] are present in the [DataTransfer].
     * Note that [DataTransferFile] entries are only created when dropping content from outside the editor, such as
     * from the operating system.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropEditProviderMetadata.dropMimeTypes)
     */
    val dropMimeTypes: ReadonlyArray<JsString>
}
