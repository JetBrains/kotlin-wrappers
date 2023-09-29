@file:JsModule("node:fs")

package node.fs


/**
 * Synchronously creates a directory. Returns `undefined`, or if `recursive` is`true`, the first directory path created.
 * This is the synchronous version of {@link mkdir}.
 *
 * See the POSIX [`mkdir(2)`](http://man7.org/linux/man-pages/man2/mkdir.2.html) documentation for more details.
 * @since v0.1.21
 */
external fun mkdirSync(path: PathLike, options: MkdirSyncRecursiveOptions): String?

/**
 * Synchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */
external fun mkdirSync(path: PathLike, options: Mode? = definedExternally): Unit

external fun mkdirSync(path: PathLike, options: (MkdirSyncOptions)? = definedExternally): Unit

/**
 * Synchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */


external fun mkdirSync(path: PathLike, options: MakeDirectoryOptions? = definedExternally): String?
