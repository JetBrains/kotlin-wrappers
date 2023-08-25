// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise
import node.buffer.Buffer
import node.buffer.BufferEncoding

/**
 * Asynchronously reads the entire contents of a file.
 *
 * If no encoding is specified (using `options.encoding`), the data is returned
 * as a `Buffer` object. Otherwise, the data will be a string.
 *
 * If `options` is a string, then it specifies the encoding.
 *
 * When the `path` is a directory, the behavior of `fsPromises.readFile()` is
 * platform-specific. On macOS, Linux, and Windows, the promise will be rejected
 * with an error. On FreeBSD, a representation of the directory's contents will be
 * returned.
 *
 * It is possible to abort an ongoing `readFile` using an `AbortSignal`. If a
 * request is aborted the promise returned is rejected with an `AbortError`:
 *
 * ```js
 * import { readFile } from 'fs/promises';
 *
 * try {
 *   const controller = new AbortController();
 *   const { signal } = controller;
 *   const promise = readFile(fileName, { signal });
 *
 *   // Abort the request before the promise settles.
 *   controller.abort();
 *
 *   await promise;
 * } catch (err) {
 *   // When a request is aborted - err is an AbortError
 *   console.error(err);
 * }
 * ```
 *
 * Aborting an ongoing request does not abort individual operating
 * system requests but rather the internal buffering `fs.readFile` performs.
 *
 * Any specified `FileHandle` has to support reading.
 * @since v10.0.0
 * @param path filename or `FileHandle`
 * @return Fulfills with the contents of the file.
 */
@JsName("readFile")
external fun readFileAsync(
    path: PathLike, /* | FileHandle */
    options: Any? /*         | ({
              encoding?: null | undefined;
              flag?: OpenMode | undefined;
          } & Abortable)
        */ = definedExternally,
): Promise<Buffer>


/**
 * Asynchronously reads the entire contents of a file.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
 * @param options An object that may contain an optional flag.
 * If a flag is not provided, it defaults to `'r'`.
 */
@JsName("readFile")
external fun readFileAsync(
    path: PathLike, /* | FileHandle */
    options: BufferEncoding,
    /*         | ({
              encoding: BufferEncoding;
              flag?: OpenMode | undefined;
          } & Abortable)
        | BufferEncoding */
): Promise<String>
