@file:JsModule("node:fs")

package node.fs


/**
 * When `file` is a filename, asynchronously writes data to the file, replacing the
 * file if it already exists. `data` can be a string or a buffer.
 *
 * When `file` is a file descriptor, the behavior is similar to calling`fs.write()` directly (which is recommended). See the notes below on using
 * a file descriptor.
 *
 * The `encoding` option is ignored if `data` is a buffer.
 *
 * The `mode` option only affects the newly created file. See {@link open} for more details.
 *
 * ```js
 * import { writeFile } from 'fs';
 * import { Buffer } from 'buffer';
 *
 * const data = new Uint8Array(Buffer.from('Hello Node.js'));
 * writeFile('message.txt', data, (err) => {
 *   if (err) throw err;
 *   console.log('The file has been saved!');
 * });
 * ```
 *
 * If `options` is a string, then it specifies the encoding:
 *
 * ```js
 * import { writeFile } from 'fs';
 *
 * writeFile('message.txt', 'Hello Node.js', 'utf8', callback);
 * ```
 *
 * It is unsafe to use `fs.writeFile()` multiple times on the same file without
 * waiting for the callback. For this scenario, {@link createWriteStream} is
 * recommended.
 *
 * Similarly to `fs.readFile` \- `fs.writeFile` is a convenience method that
 * performs multiple `write` calls internally to write the buffer passed to it.
 * For performance sensitive code consider using {@link createWriteStream}.
 *
 * It is possible to use an `AbortSignal` to cancel an `fs.writeFile()`.
 * Cancelation is "best effort", and some amount of data is likely still
 * to be written.
 *
 * ```js
 * import { writeFile } from 'fs';
 * import { Buffer } from 'buffer';
 *
 * const controller = new AbortController();
 * const { signal } = controller;
 * const data = new Uint8Array(Buffer.from('Hello Node.js'));
 * writeFile('message.txt', data, { signal }, (err) => {
 *   // When a request is aborted - the callback is called with an AbortError
 * });
 * // When the request should be aborted
 * controller.abort();
 * ```
 *
 * Aborting an ongoing request does not abort individual operating
 * system requests but rather the internal buffering `fs.writeFile` performs.
 * @since v0.1.29
 * @param file filename or file descriptor
 */
external fun writeFile(
    file: PathOrFileDescriptor,
    data: String,
    options: WriteFileOptions,
    callback: NoParamCallback,
): Unit

external fun writeFile(
    file: PathOrFileDescriptor,
    data: js.buffer.ArrayBufferView,
    options: WriteFileOptions,
    callback: NoParamCallback,
): Unit

/**
 * Asynchronously writes data to a file, replacing the file if it already exists.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
 * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
 */
external fun writeFile(path: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit

external fun writeFile(path: PathOrFileDescriptor, data: js.buffer.ArrayBufferView, callback: NoParamCallback): Unit
