// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * Provides additional metadata about how a {@linkcode DocumentDropEditProvider} works.
 */
external interface DocumentDropEditProviderMetadata {
    /**
     * List of {@link DocumentDropOrPasteEditKind kinds} that the provider may return in {@linkcode DocumentDropEditProvider.provideDocumentDropEdits provideDocumentDropEdits}.
     *
     * This is used to filter out providers when a specific {@link DocumentDropOrPasteEditKind kind} of edit is requested.
     */
    val providedDropEditKinds: ReadonlyArray<DocumentDropOrPasteEditKind>?

    /**
     * List of {@link DataTransfer} mime types that the provider can handle.
     *
     * This can either be an exact mime type such as `image/png`, or a wildcard pattern such as `image/​*`.
     *
     * Use `text/uri-list` for resources dropped from the explorer or other tree views in the workbench.
     *
     * Use `files` to indicate that the provider should be invoked if any {@link DataTransferFile files} are present in the {@link DataTransfer}.
     * Note that {@link DataTransferFile} entries are only created when dropping content from outside the editor, such as
     * from the operating system.
     */
    val dropMimeTypes: ReadonlyArray<String>
}
