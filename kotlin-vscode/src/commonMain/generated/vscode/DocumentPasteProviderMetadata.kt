// Automatically generated - do not modify!

package vscode

/**
 * Provides additional metadata about how a {@linkcode DocumentPasteEditProvider} works.
 */
external interface DocumentPasteProviderMetadata {
    /**
    // ORIGINAL SOURCE

    /**
     * List of {@link DocumentDropOrPasteEditKind kinds} that the provider may return in {@linkcode DocumentPasteEditProvider.provideDocumentPasteEdits provideDocumentPasteEdits}.
     *
     * This is used to filter out providers when a specific {@link DocumentDropOrPasteEditKind kind} of edit is requested.
    */
    readonly providedPasteEditKinds: readonly DocumentDropOrPasteEditKind[];

    /**
     * Mime types that {@linkcode DocumentPasteEditProvider.prepareDocumentPaste prepareDocumentPaste} may add on copy.
    */
    readonly copyMimeTypes?: readonly string[];

    /**
     * Mime types that {@linkcode DocumentPasteEditProvider.provideDocumentPasteEdits provideDocumentPasteEdits} should be invoked for.
     *
     * This can either be an exact mime type such as `image/png`, or a wildcard pattern such as `image/​*`.
     *
     * Use `text/uri-list` for resources dropped from the explorer or other tree views in the workbench.
     *
     * Use `files` to indicate that the provider should be invoked if any {@link DataTransferFile files} are present in the {@linkcode DataTransfer}.
     * Note that {@linkcode DataTransferFile} entries are only created when pasting content from outside the editor, such as
     * from the operating system.
    */
    readonly pasteMimeTypes?: readonly string[];

    // ORIGINAL SOURCE
     **/
}
