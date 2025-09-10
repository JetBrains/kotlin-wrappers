// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.Void
import js.objects.JsPlainObject
import js.promise.PromiseLike
import js.typedarrays.Uint8Array
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * The file system interface exposes the editor's built-in and contributed
 * [file system providers][FileSystemProvider]. It allows extensions to work
 * with files from the local disk as well as files from remote places, like the
 * remote extension host or ftp-servers.
 *
 * *Note* that an instance of this interface is available as {@linkcode workspace.fs}.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem)
 */
external interface FileSystem {
    /**
     * Retrieve metadata about a file.
     *
     * @param uri The uri of the file to retrieve metadata about.
     * @returns The file metadata about the file.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.stat)
     */
    fun stat(uri: Uri): PromiseLike<FileStat>

    /**
     * Retrieve all entries of a [directory][FileType.Directory].
     *
     * @param uri The uri of the folder.
     * @returns An array of name/type-tuples or a thenable that resolves to such.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.readDirectory)
     */
    fun readDirectory(uri: Uri): PromiseLike<ReadonlyArray<Tuple2<JsString, FileType>>>

    /**
     * Create a new directory (Note, that new files are created via `write`-calls).
     *
     * *Note* that missing directories are created automatically, e.g this call has
     * `mkdirp` semantics.
     *
     * @param uri The uri of the new folder.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.createDirectory)
     */
    fun createDirectory(uri: Uri): PromiseLike<Void>

    /**
     * Read the entire contents of a file.
     *
     * @param uri The uri of the file.
     * @returns An array of bytes or a thenable that resolves to such.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.readFile)
     */
    fun readFile(uri: Uri): PromiseLike<Uint8Array<*>>

    /**
     * Write data to a file, replacing its entire contents.
     *
     * @param uri The uri of the file.
     * @param content The new content of the file.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.writeFile)
     */
    fun writeFile(
        uri: Uri,
        content: Uint8Array<*>,
    ): PromiseLike<Void>

    /**
     * Delete a file.
     *
     * @param uri The resource that is to be deleted.
     * @param options Defines if trash can should be used and if deletion of folders is recursive
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.delete)
     */
    fun delete(
        uri: Uri,
        options: DeleteOptions = definedExternally,
    ): PromiseLike<Void>


    @JsPlainObject
    interface DeleteOptions {
        /**
         * Delete the content recursively if a folder is denoted.
         */
        var recursive: Boolean?

        /**
         * Use the os's trashcan instead of permanently deleting files whenever possible.
         */
        var useTrash: Boolean?
    }

    /**
     * Rename a file or folder.
     *
     * @param source The existing file.
     * @param target The new location.
     * @param options Defines if existing files should be overwritten.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.rename)
     */
    fun rename(
        source: Uri,
        target: Uri,
        options: RenameOptions = definedExternally,
    ): PromiseLike<Void>


    @JsPlainObject
    interface RenameOptions {
        /**
         * Overwrite the file if it does exist.
         */
        var overwrite: Boolean?
    }

    /**
     * Copy files or folders.
     *
     * @param source The existing file.
     * @param target The destination location.
     * @param options Defines if existing files should be overwritten.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.copy)
     */
    fun copy(
        source: Uri,
        target: Uri,
        options: CopyOptions = definedExternally,
    ): PromiseLike<Void>


    @JsPlainObject
    interface CopyOptions {
        /**
         * Overwrite the file if it does exist.
         */
        var overwrite: Boolean?
    }

    /**
     * Check if a given file system supports writing files.
     *
     * Keep in mind that just because a file system supports writing, that does
     * not mean that writes will always succeed. There may be permissions issues
     * or other errors that prevent writing a file.
     *
     * @param scheme The scheme of the filesystem, for example `file` or `git`.
     *
     * @returns `true` if the file system supports writing, `false` if it does not
     * support writing (i.e. it is readonly), and `undefined` if the editor does not
     * know about the filesystem.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystem.isWritableFileSystem)
     */
    fun isWritableFileSystem(scheme: String): Boolean?
}
