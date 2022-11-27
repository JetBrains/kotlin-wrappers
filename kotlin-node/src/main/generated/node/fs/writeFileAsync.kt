// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")
@file:JsNonModule

package node.fs

import js.core.Void
import node.buffer.BufferEncoding
import kotlin.js.Promise

/**
 * Asynchronously writes data to a file, replacing the file if it already exists.`data` can be a string, a buffer, an
 * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface) or
 * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
 *
 * The `encoding` option is ignored if `data` is a buffer.
 *
 * If `options` is a string, then it specifies the encoding.
 *
 * The `mode` option only affects the newly created file. See `fs.open()` for more details.
 *
 * Any specified `FileHandle` has to support writing.
 *
 * It is unsafe to use `fsPromises.writeFile()` multiple times on the same file
 * without waiting for the promise to be settled.
 *
 * Similarly to `fsPromises.readFile` \- `fsPromises.writeFile` is a convenience
 * method that performs multiple `write` calls internally to write the buffer
 * passed to it. For performance sensitive code consider using `fs.createWriteStream()` or `filehandle.createWriteStream()`.
 *
 * It is possible to use an `AbortSignal` to cancel an `fsPromises.writeFile()`.
 * Cancelation is "best effort", and some amount of data is likely still
 * to be written.
 *
 * ```js
 * import { writeFile } from 'fs/promises';
 * import { Buffer } from 'buffer';
 *
 * try {
 *   const controller = new AbortController();
 *   const { signal } = controller;
 *   const data = new Uint8Array(Buffer.from('Hello Node.js'));
 *   const promise = writeFile('message.txt', data, { signal });
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
 * system requests but rather the internal buffering `fs.writeFile` performs.
 * @since v10.0.0
 * @param file filename or `FileHandle`
 * @return Fulfills with `undefined` upon success.
 */
@JsName("writeFile")
external fun writeFileAsync(
    file: PathLike, /* | FileHandle */
    data: Any, /* string | NodeJS.ArrayBufferView | Iterable<string | NodeJS.ArrayBufferView> | AsyncIterable<string | NodeJS.ArrayBufferView> | Stream */
    options: BufferEncoding? /*         | (ObjectEncodingOptions & {
              mode?: Mode | undefined;
              flag?: OpenMode | undefined;
          } & Abortable)
        | BufferEncoding
        */ = definedExternally,
): Promise<Void>
