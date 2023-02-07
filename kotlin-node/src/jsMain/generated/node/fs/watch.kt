// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.core.AsyncIterable
import node.buffer.BufferEncoding

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */
external fun watch(
    filename: PathLike,
    options: BufferEncoding /* WatchOptions | BufferEncoding */ = definedExternally,
): AsyncIterable<FileChangeInfo<String>>
