// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

import node.buffer.NonSharedBuffer

/**
 * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
 *
 * ```js
 * import { watch } from 'node:fs/promises';
 *
 * const ac = new AbortController();
 * const { signal } = ac;
 * setTimeout(() => ac.abort(), 10000);
 *
 * (async () => {
 *   try {
 *     const watcher = watch(__filename, { signal });
 *     for await (const event of watcher)
 *       console.log(event);
 *   } catch (err) {
 *     if (err.name === 'AbortError')
 *       return;
 *     throw err;
 *   }
 * })();
 * ```
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
 * @since v15.9.0, v14.18.0
 * @return of objects with the properties:
 */
external fun watch(filename: PathLike): js.iterable.AsyncIterator<FileChangeInfo<String>>

/**
 * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
 *
 * ```js
 * import { watch } from 'node:fs/promises';
 *
 * const ac = new AbortController();
 * const { signal } = ac;
 * setTimeout(() => ac.abort(), 10000);
 *
 * (async () => {
 *   try {
 *     const watcher = watch(__filename, { signal });
 *     for await (const event of watcher)
 *       console.log(event);
 *   } catch (err) {
 *     if (err.name === 'AbortError')
 *       return;
 *     throw err;
 *   }
 * })();
 * ```
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
 * @since v15.9.0, v14.18.0
 * @return of objects with the properties:
 */
external fun watch(
    filename: PathLike,
    options: WatchOptionsWithStringEncoding = definedExternally,
): js.iterable.AsyncIterator<FileChangeInfo<String>>

/**
 * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
 *
 * ```js
 * import { watch } from 'node:fs/promises';
 *
 * const ac = new AbortController();
 * const { signal } = ac;
 * setTimeout(() => ac.abort(), 10000);
 *
 * (async () => {
 *   try {
 *     const watcher = watch(__filename, { signal });
 *     for await (const event of watcher)
 *       console.log(event);
 *   } catch (err) {
 *     if (err.name === 'AbortError')
 *       return;
 *     throw err;
 *   }
 * })();
 * ```
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
 * @since v15.9.0, v14.18.0
 * @return of objects with the properties:
 */
external fun watch(
    filename: PathLike,
    options: node.buffer.BufferEncoding = definedExternally,
): js.iterable.AsyncIterator<FileChangeInfo<String>>

external fun watch(
    filename: PathLike,
    options: WatchOptionsWithBufferEncoding,
): js.iterable.AsyncIterator<FileChangeInfo<NonSharedBuffer>>

external fun watch(
    filename: PathLike,
    options: String, /* "buffer" */
): js.iterable.AsyncIterator<FileChangeInfo<NonSharedBuffer>>

external fun watch(
    filename: PathLike,
    options: WatchOptions,
): js.iterable.AsyncIterator<FileChangeInfo<Any /* string | NonSharedBuffer */>>
