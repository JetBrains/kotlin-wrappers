// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.Void
import js.promise.PromiseLike
import js.promise.PromiseResult
import js.typedarrays.Uint8Array

/**
 * The filesystem provider defines what the editor needs to read, write, discover,
 * and to manage files and folders. It allows extensions to serve files from remote places,
 * like ftp-servers, and to seamlessly integrate those into the editor.
 *
 * * *Note 1:* The filesystem provider API works with {@link Uri uris} and assumes hierarchical
 * paths, e.g. `foo:/my/path` is a child of `foo:/my/` and a parent of `foo:/my/path/deeper`.
 * * *Note 2:* There is an activation event `onFileSystem:<scheme>` that fires when a file
 * or folder is being accessed.
 * * *Note 3:* The word 'file' is often used to denote all {@link FileType kinds} of files, e.g.
 * folders, symbolic links, and regular files.
 */
external interface FileSystemProvider {
    /**
     * An event to signal that a resource has been created, changed, or deleted. This
     * event should fire for resources that are being {@link FileSystemProvider.watch watched}
     * by clients of this provider.
     *
     * *Note:* It is important that the metadata of the file that changed provides an
     * updated `mtime` that advanced from the previous value in the {@link FileStat stat} and a
     * correct `size` value. Otherwise there may be optimizations in place that will not show
     * the change in an editor for example.
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
     * It is the file system provider's job to call {@linkcode FileSystemProvider.onDidChangeFile onDidChangeFile}
     * for every change given these rules. No event should be emitted for files that match any of the provided
     * excludes.
     *
     * @param uri The uri of the file or folder to be watched.
     * @param options Configures the watch.
     * @returns A disposable that tells the provider to stop watching the `uri`.
     */
    /*
    watch(uri: Uri, options: {
        /**
         * When enabled also watch subfolders.
         */
        readonly recursive: boolean;
        /**
         * A list of paths and pattern to exclude from watching.
         */
        readonly excludes: readonly string[];
    }): Disposable
    */

    /**
     * Retrieve metadata about a file.
     *
     * Note that the metadata for symbolic links should be the metadata of the file they refer to.
     * Still, the {@link FileType.SymbolicLink SymbolicLink}-type must be used in addition to the actual type, e.g.
     * `FileType.SymbolicLink | FileType.Directory`.
     *
     * @param uri The uri of the file to retrieve metadata about.
     * @returns The file metadata about the file.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when `uri` doesn't exist.
     */
    fun stat(uri: Uri): PromiseResult<FileStat>

    /**
     * Retrieve all entries of a {@link FileType.Directory directory}.
     *
     * @param uri The uri of the folder.
     * @returns An array of name/type-tuples or a thenable that resolves to such.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when `uri` doesn't exist.
     */
    fun readDirectory(uri: Uri): PromiseResult<ReadonlyArray<Tuple2<String, FileType>>>

    /**
     * Create a new directory (Note, that new files are created via `write`-calls).
     *
     * @param uri The uri of the new folder.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when the parent of `uri` doesn't exist, e.g. no mkdirp-logic required.
     * @throws {@linkcode FileSystemError.FileExists FileExists} when `uri` already exists.
     * @throws {@linkcode FileSystemError.NoPermissions NoPermissions} when permissions aren't sufficient.
     */
    fun createDirectory(uri: Uri): PromiseLike<Void>?

    /**
     * Read the entire contents of a file.
     *
     * @param uri The uri of the file.
     * @returns An array of bytes or a thenable that resolves to such.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when `uri` doesn't exist.
     */
    fun readFile(uri: Uri): PromiseResult<Uint8Array<*>>

    /**
     * Write data to a file, replacing its entire contents.
     *
     * @param uri The uri of the file.
     * @param content The new content of the file.
     * @param options Defines if missing files should or must be created.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when `uri` doesn't exist and `create` is not set.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when the parent of `uri` doesn't exist and `create` is set, e.g. no mkdirp-logic required.
     * @throws {@linkcode FileSystemError.FileExists FileExists} when `uri` already exists, `create` is set but `overwrite` is not set.
     * @throws {@linkcode FileSystemError.NoPermissions NoPermissions} when permissions aren't sufficient.
     */
    /*
    writeFile(uri: Uri, content: Uint8Array, options: {
        /**
         * Create the file if it does not exist already.
         */
        readonly create: boolean;
        /**
         * Overwrite the file if it does exist.
         */
        readonly overwrite: boolean;
    }): void | Thenable<void>
    */

    /**
     * Delete a file.
     *
     * @param uri The resource that is to be deleted.
     * @param options Defines if deletion of folders is recursive.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when `uri` doesn't exist.
     * @throws {@linkcode FileSystemError.NoPermissions NoPermissions} when permissions aren't sufficient.
     */
    /*
    delete(uri: Uri, options: {
        /**
         * Delete the content recursively if a folder is denoted.
         */
        readonly recursive: boolean;
    }): void | Thenable<void>
    */

    /**
     * Rename a file or folder.
     *
     * @param oldUri The existing file.
     * @param newUri The new location.
     * @param options Defines if existing files should be overwritten.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when `oldUri` doesn't exist.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when parent of `newUri` doesn't exist, e.g. no mkdirp-logic required.
     * @throws {@linkcode FileSystemError.FileExists FileExists} when `newUri` exists and when the `overwrite` option is not `true`.
     * @throws {@linkcode FileSystemError.NoPermissions NoPermissions} when permissions aren't sufficient.
     */
    /*
    rename(oldUri: Uri, newUri: Uri, options: {
        /**
         * Overwrite the file if it does exist.
         */
        readonly overwrite: boolean;
    }): void | Thenable<void>
    */

    /**
     * Copy files or folders. Implementing this function is optional but it will speedup
     * the copy operation.
     *
     * @param source The existing file.
     * @param destination The destination location.
     * @param options Defines if existing files should be overwritten.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when `source` doesn't exist.
     * @throws {@linkcode FileSystemError.FileNotFound FileNotFound} when parent of `destination` doesn't exist, e.g. no mkdirp-logic required.
     * @throws {@linkcode FileSystemError.FileExists FileExists} when `destination` exists and when the `overwrite` option is not `true`.
     * @throws {@linkcode FileSystemError.NoPermissions NoPermissions} when permissions aren't sufficient.
     */
    /*
    copy?(source: Uri, destination: Uri, options: {
        /**
         * Overwrite the file if it does exist.
         */
        readonly overwrite: boolean;
    }): void | Thenable<void>
    */
}
