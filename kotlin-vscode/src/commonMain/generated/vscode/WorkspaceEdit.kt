// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A workspace edit is a collection of textual and files changes for
 * multiple resources and documents.
 *
 * Use the {@link workspace.applyEdit applyEdit}-function to apply a workspace edit.
 */
open external class WorkspaceEdit {
    /**
     * The number of affected resources of textual or resource changes.
     */
    val size: Int

    /**
     * Replace the given range with given text for the given resource.
     *
     * @param uri A resource identifier.
     * @param range A range.
     * @param newText A string.
     * @param metadata Optional metadata for the entry.
     */
//  replace(uri: Uri, range: Range, newText: string, metadata?: WorkspaceEditEntryMetadata): void;

    /**
     * Insert the given text at the given position.
     *
     * @param uri A resource identifier.
     * @param position A position.
     * @param newText A string.
     * @param metadata Optional metadata for the entry.
     */
//  insert(uri: Uri, position: Position, newText: string, metadata?: WorkspaceEditEntryMetadata): void;

    /**
     * Delete the text at the given range.
     *
     * @param uri A resource identifier.
     * @param range A range.
     * @param metadata Optional metadata for the entry.
     */
//  delete(uri: Uri, range: Range, metadata?: WorkspaceEditEntryMetadata): void;

    /**
     * Check if a text edit for a resource exists.
     *
     * @param uri A resource identifier.
     * @returns `true` if the given resource will be touched by this edit.
     */
//  has(uri: Uri): boolean;

    /**
     * Set (and replace) text edits or snippet edits for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     */
//  set(uri: Uri, edits: ReadonlyArray<TextEdit | SnippetTextEdit>): void;

    /**
     * Set (and replace) text edits or snippet edits with metadata for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     */
//  set(uri: Uri, edits: ReadonlyArray<[TextEdit | SnippetTextEdit, WorkspaceEditEntryMetadata | undefined]>): void;

    /**
     * Set (and replace) notebook edits for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     */
//  set(uri: Uri, edits: readonly NotebookEdit[]): void;

    /**
     * Set (and replace) notebook edits with metadata for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     */
//  set(uri: Uri, edits: ReadonlyArray<[NotebookEdit, WorkspaceEditEntryMetadata | undefined]>): void;

    /**
     * Get the text edits for a resource.
     *
     * @param uri A resource identifier.
     * @returns An array of text edits.
     */
//  get(uri: Uri): TextEdit[];

    /**
     * Create a regular file.
     *
     * @param uri Uri of the new file.
     * @param options Defines if an existing file should be overwritten or be
     * ignored. When `overwrite` and `ignoreIfExists` are both set `overwrite` wins.
     * When both are unset and when the file already exists then the edit cannot
     * be applied successfully. The `content`-property allows to set the initial contents
     * the file is being created with.
     * @param metadata Optional metadata for the entry.
     */
    /*
    createFile(uri: Uri, options?: {
        /**
         * Overwrite existing file. Overwrite wins over `ignoreIfExists`
         */
        readonly overwrite?: boolean;
        /**
         * Do nothing if a file with `uri` exists already.
         */
        readonly ignoreIfExists?: boolean;
        /**
         * The initial contents of the new file.
         *
         * If creating a file from a {@link DocumentDropEditProvider drop operation}, you can
         * pass in a {@link DataTransferFile} to improve performance by avoiding extra data copying.
         */
        readonly contents?: Uint8Array | DataTransferFile;
    }, metadata?: WorkspaceEditEntryMetadata): void;
    */

    /**
     * Delete a file or folder.
     *
     * @param uri The uri of the file that is to be deleted.
     * @param metadata Optional metadata for the entry.
     */
    /*
    deleteFile(uri: Uri, options?: {
        /**
         * Delete the content recursively if a folder is denoted.
         */
        readonly recursive?: boolean;
        /**
         * Do nothing if a file with `uri` exists already.
         */
        readonly ignoreIfNotExists?: boolean;
    }, metadata?: WorkspaceEditEntryMetadata): void;
    */

    /**
     * Rename a file or folder.
     *
     * @param oldUri The existing file.
     * @param newUri The new location.
     * @param options Defines if existing files should be overwritten or be
     * ignored. When overwrite and ignoreIfExists are both set overwrite wins.
     * @param metadata Optional metadata for the entry.
     */
    /*
    renameFile(oldUri: Uri, newUri: Uri, options?: {
        /**
         * Overwrite existing file. Overwrite wins over `ignoreIfExists`
         */
        readonly overwrite?: boolean;
        /**
         * Do nothing if a file with `uri` exists already.
         */
        readonly ignoreIfExists?: boolean;
    }, metadata?: WorkspaceEditEntryMetadata): void;
    */

    /**
     * Get all text edits grouped by resource.
     *
     * @returns A shallow copy of `[Uri, TextEdit[]]`-tuples.
     */
//  entries(): [Uri, TextEdit[]][];
}
