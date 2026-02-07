// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.Void
import js.promise.PromiseLike
import js.promise.PromiseResult
import js.typedarrays.Uint8Array
import kotlinx.js.JsPlainObject
import kotlin.js.JsString

/**
 * The filesystem provider defines what the editor needs to read, write, discover,
 * and to manage files and folders. It allows extensions to serve files from remote places,
 * like ftp-servers, and to seamlessly integrate those into the editor.
 *
 * * *Note 1:* The filesystem provider API works with [uris][Uri] and assumes hierarchical
 * paths, e.g. `foo:/my/path` is a child of `foo:/my/` and a parent of `foo:/my/path/deeper`.
 * * *Note 2:* There is an activation event `onFileSystem:<scheme>` that fires when a file
 * or folder is being accessed.
 * * *Note 3:* The word 'file' is often used to denote all [kinds][FileType] of files, e.g.
 * folders, symbolic links, and regular files.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider)
 */
external interface FileSystemProvider {
    /**
     * An event to signal that a resource has been created, changed, or deleted. This
     * event should fire for resources that are being [watched][FileSystemProvider.watch]
     * by clients of this provider.
     *
     * *Note:* It is important that the metadata of the file that changed provides an
     * updated `mtime` that advanced from the previous value in the [stat][FileStat] and a
     * correct `size` value. Otherwise there may be optimizations in place that will not show
     * the change in an editor for example.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.onDidChangeFile)
     */
    val onDidChangeFile: Event<ReadonlyArray<FileChangeEvent>>

    /**
     * Subscribes to file change events in the file or folder denoted by `uri`. For folders,
     * the option `recursive` indicates whether subfolders, sub-subfolders, etc. should
     * be watched for file changes as well. With `recursive: false`, only changes to the
     * files that are direct children of the folder should trigger an event.
     *
     * The `excludes` array is used to indicate paths that should be excluded from file
     * watching. It is typically derived from the `files.watcherExclude` setting that
     * is configurable by the user. Each entry can be be:
     * - the absolute path to exclude
     * - a relative path to exclude (for example `build/output`)
     * - a simple glob pattern (for example `**​/build`, `output/​**`)
     *
     * *Note* that case-sensitivity of the [excludes] patterns for built-in file system providers
     * will depend on the underlying file system: on Windows and macOS the matching will be case-insensitive and
     * on Linux it will be case-sensitive.
     *
     * It is the file system provider's job to call [onDidChangeFile][FileSystemProvider.onDidChangeFile]
     * for every change given these rules. No event should be emitted for files that match any of the provided
     * excludes.
     *
     * @param uri The uri of the file or folder to be watched.
     * @param options Configures the watch.
     * @returns A disposable that tells the provider to stop watching the `uri`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.watch)
     */
    fun watch(
        uri: Uri,
        options: WatchOptions,
    ): Disposable


    @JsPlainObject
    interface WatchOptions {
        /**
         * When enabled also watch subfolders.
         */
        val recursive: Boolean

        /**
         * A list of paths and pattern to exclude from watching.
         */
        val excludes: ReadonlyArray<JsString>
    }

    /**
     * Retrieve metadata about a file.
     *
     * Note that the metadata for symbolic links should be the metadata of the file they refer to.
     * Still, the [SymbolicLink][FileType.SymbolicLink]-type must be used in addition to the actual type, e.g.
     * `FileType.SymbolicLink | FileType.Directory`.
     *
     * @param uri The uri of the file to retrieve metadata about.
     * @returns The file metadata about the file.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when `uri` doesn't exist.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.stat)
     */
    fun stat(uri: Uri): PromiseResult<FileStat>

    /**
     * Retrieve all entries of a [directory][FileType.Directory].
     *
     * @param uri The uri of the folder.
     * @returns An array of name/type-tuples or a thenable that resolves to such.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when `uri` doesn't exist.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.readDirectory)
     */
    fun readDirectory(uri: Uri): PromiseResult<ReadonlyArray<Tuple2<JsString, FileType>>>

    /**
     * Create a new directory (Note, that new files are created via `write`-calls).
     *
     * @param uri The uri of the new folder.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when the parent of `uri` doesn't exist, e.g. no mkdirp-logic required.
     * @throws [FileExists][FileSystemError.FileExists] when `uri` already exists.
     * @throws [NoPermissions][FileSystemError.NoPermissions] when permissions aren't sufficient.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.createDirectory)
     */
    fun createDirectory(uri: Uri): PromiseLike<Void>?

    /**
     * Read the entire contents of a file.
     *
     * @param uri The uri of the file.
     * @returns An array of bytes or a thenable that resolves to such.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when `uri` doesn't exist.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.readFile)
     */
    fun readFile(uri: Uri): PromiseResult<Uint8Array<*>>

    /**
     * Write data to a file, replacing its entire contents.
     *
     * @param uri The uri of the file.
     * @param content The new content of the file.
     * @param options Defines if missing files should or must be created.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when `uri` doesn't exist and `create` is not set.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when the parent of `uri` doesn't exist and `create` is set, e.g. no mkdirp-logic required.
     * @throws [FileExists][FileSystemError.FileExists] when `uri` already exists, `create` is set but `overwrite` is not set.
     * @throws [NoPermissions][FileSystemError.NoPermissions] when permissions aren't sufficient.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.writeFile)
     */
    fun writeFile(
        uri: Uri,
        content: Uint8Array<*>,
        options: WriteFileOptions,
    ): PromiseLike<Void>?


    @JsPlainObject
    interface WriteFileOptions {
        /**
         * Create the file if it does not exist already.
         */
        val create: Boolean

        /**
         * Overwrite the file if it does exist.
         */
        val overwrite: Boolean
    }

    /**
     * Delete a file.
     *
     * @param uri The resource that is to be deleted.
     * @param options Defines if deletion of folders is recursive.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when `uri` doesn't exist.
     * @throws [NoPermissions][FileSystemError.NoPermissions] when permissions aren't sufficient.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.delete)
     */
    fun delete(
        uri: Uri,
        options: DeleteOptions,
    ): PromiseLike<Void>?


    @JsPlainObject
    interface DeleteOptions {
        /**
         * Delete the content recursively if a folder is denoted.
         */
        val recursive: Boolean
    }

    /**
     * Rename a file or folder.
     *
     * @param oldUri The existing file.
     * @param newUri The new location.
     * @param options Defines if existing files should be overwritten.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when `oldUri` doesn't exist.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when parent of `newUri` doesn't exist, e.g. no mkdirp-logic required.
     * @throws [FileExists][FileSystemError.FileExists] when `newUri` exists and when the `overwrite` option is not `true`.
     * @throws [NoPermissions][FileSystemError.NoPermissions] when permissions aren't sufficient.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.rename)
     */
    fun rename(
        oldUri: Uri,
        newUri: Uri,
        options: RenameOptions,
    ): PromiseLike<Void>?


    @JsPlainObject
    interface RenameOptions {
        /**
         * Overwrite the file if it does exist.
         */
        val overwrite: Boolean
    }

    /**
     * Copy files or folders. Implementing this function is optional but it will speedup
     * the copy operation.
     *
     * @param source The existing file.
     * @param destination The destination location.
     * @param options Defines if existing files should be overwritten.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when `source` doesn't exist.
     * @throws [FileNotFound][FileSystemError.FileNotFound] when parent of `destination` doesn't exist, e.g. no mkdirp-logic required.
     * @throws [FileExists][FileSystemError.FileExists] when `destination` exists and when the `overwrite` option is not `true`.
     * @throws [NoPermissions][FileSystemError.NoPermissions] when permissions aren't sufficient.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemProvider.copy)
     */
    var copy: ((
        source: Uri,
        destination: Uri,
        options: CopyOptions,
    ) -> PromiseLike<Void>?)?


    @JsPlainObject
    interface CopyOptions {
        /**
         * Overwrite the file if it does exist.
         */
        val overwrite: Boolean
    }
}
