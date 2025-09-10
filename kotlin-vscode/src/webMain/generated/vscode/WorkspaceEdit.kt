// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.objects.JsPlainObject
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A workspace edit is a collection of textual and files changes for
 * multiple resources and documents.
 *
 * Use the [applyEdit][workspace.applyEdit]-function to apply a workspace edit.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit)
 */
open external class WorkspaceEdit {
    /**
     * The number of affected resources of textual or resource changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.size)
     */
    val size: Int

    /**
     * Replace the given range with given text for the given resource.
     *
     * @param uri A resource identifier.
     * @param range A range.
     * @param newText A string.
     * @param metadata Optional metadata for the entry.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.replace)
     */
    fun replace(
        uri: Uri,
        range: Range,
        newText: String,
        metadata: WorkspaceEditEntryMetadata = definedExternally,
    )

    /**
     * Insert the given text at the given position.
     *
     * @param uri A resource identifier.
     * @param position A position.
     * @param newText A string.
     * @param metadata Optional metadata for the entry.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.insert)
     */
    fun insert(
        uri: Uri,
        position: Position,
        newText: String,
        metadata: WorkspaceEditEntryMetadata = definedExternally,
    )

    /**
     * Delete the text at the given range.
     *
     * @param uri A resource identifier.
     * @param range A range.
     * @param metadata Optional metadata for the entry.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.delete)
     */
    fun delete(
        uri: Uri,
        range: Range,
        metadata: WorkspaceEditEntryMetadata = definedExternally,
    )

    /**
     * Check if a text edit for a resource exists.
     *
     * @param uri A resource identifier.
     * @returns `true` if the given resource will be touched by this edit.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.has)
     */
    fun has(uri: Uri): Boolean

    /**
     * Set (and replace) text edits or snippet edits for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.set)
     */
    fun set(
        uri: Uri,
        edits: ReadonlyArray<JsAny /* TextEdit | SnippetTextEdit */>,
    )

    /**
     * Set (and replace) text edits or snippet edits with metadata for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.set)
     */
    fun set(
        uri: Uri,
        edits: ReadonlyArray<Tuple2<JsAny /* TextEdit | SnippetTextEdit */, WorkspaceEditEntryMetadata?>>,
    )

    /**
     * Set (and replace) notebook edits for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.set)
     */
    fun set(
        uri: Uri,
        edits: ReadonlyArray<NotebookEdit>,
    )

    /**
     * Set (and replace) notebook edits with metadata for a resource.
     *
     * @param uri A resource identifier.
     * @param edits An array of edits.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.set)
     */
    fun set(
        uri: Uri,
        edits: ReadonlyArray<Tuple2<NotebookEdit, WorkspaceEditEntryMetadata?>>,
    )

    /**
     * Get the text edits for a resource.
     *
     * @param uri A resource identifier.
     * @returns An array of text edits.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.get)
     */
    fun get(uri: Uri): ReadonlyArray<TextEdit>

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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.createFile)
     */
    fun createFile(
        uri: Uri,
        options: CreateFileOptions = definedExternally,
        metadata: WorkspaceEditEntryMetadata = definedExternally,
    )


    @JsPlainObject
    interface CreateFileOptions {
        /**
         * Overwrite existing file. Overwrite wins over `ignoreIfExists`
         */
        val overwrite: Boolean?

        /**
         * Do nothing if a file with `uri` exists already.
         */
        val ignoreIfExists: Boolean?

        /**
         * The initial contents of the new file.
         *
         * If creating a file from a [drop operation][DocumentDropEditProvider], you can
         * pass in a [DataTransferFile] to improve performance by avoiding extra data copying.
         */
        val contents: JsAny /* Uint8Array | DataTransferFile */?
    }

    /**
     * Delete a file or folder.
     *
     * @param uri The uri of the file that is to be deleted.
     * @param metadata Optional metadata for the entry.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.deleteFile)
     */
    fun deleteFile(
        uri: Uri,
        options: DeleteFileOptions = definedExternally,
        metadata: WorkspaceEditEntryMetadata = definedExternally,
    )


    @JsPlainObject
    interface DeleteFileOptions {
        /**
         * Delete the content recursively if a folder is denoted.
         */
        val recursive: Boolean?

        /**
         * Do nothing if a file with `uri` exists already.
         */
        val ignoreIfNotExists: Boolean?
    }

    /**
     * Rename a file or folder.
     *
     * @param oldUri The existing file.
     * @param newUri The new location.
     * @param options Defines if existing files should be overwritten or be
     * ignored. When overwrite and ignoreIfExists are both set overwrite wins.
     * @param metadata Optional metadata for the entry.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.renameFile)
     */
    fun renameFile(
        oldUri: Uri,
        newUri: Uri,
        options: RenameFileOptions = definedExternally,
        metadata: WorkspaceEditEntryMetadata = definedExternally,
    )


    @JsPlainObject
    interface RenameFileOptions {
        /**
         * Overwrite existing file. Overwrite wins over `ignoreIfExists`
         */
        val overwrite: Boolean?

        /**
         * Do nothing if a file with `uri` exists already.
         */
        val ignoreIfExists: Boolean?
    }

    /**
     * Get all text edits grouped by resource.
     *
     * @returns A shallow copy of `[Uri, TextEdit[]]`-tuples.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#WorkspaceEdit.entries)
     */
    fun entries(): ReadonlyArray<Tuple2<Uri, ReadonlyArray<TextEdit>>>
}
