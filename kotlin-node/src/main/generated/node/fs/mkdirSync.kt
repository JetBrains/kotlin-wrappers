// Automatically generated - do not modify!

@file:JsModule("node:fs")
@file:JsNonModule

package node.fs

/**
 * Synchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */
external fun mkdirSync(
    path: PathLike,
    options: Any? /* Mode | MakeDirectoryOptions */ = definedExternally,
): String
