// Automatically generated - do not modify!

@file:JsModule("node:stream")
@file:JsQualifier("Stream")

package node.stream

/**
 * A readable and/or writable stream/webstream.
 *
 * A function to get notified when a stream is no longer readable, writable
 * or has experienced an error or a premature close event.
 *
 * ```js
 * import { finished } from 'node:stream';
 * import fs from 'node:fs';
 *
 * const rs = fs.createReadStream('archive.tar');
 *
 * finished(rs, (err) => {
 *   if (err) {
 *     console.error('Stream failed.', err);
 *   } else {
 *     console.log('Stream is done reading.');
 *   }
 * });
 *
 * rs.resume(); // Drain the stream.
 * ```
 *
 * Especially useful in error handling scenarios where a stream is destroyed
 * prematurely (like an aborted HTTP request), and will not emit `'end'` or `'finish'`.
 *
 * The `finished` API provides [`promise version`](https://nodejs.org/docs/latest-v24.x/api/stream.html#streamfinishedstream-options).
 *
 * `stream.finished()` leaves dangling event listeners (in particular `'error'`, `'end'`, `'finish'` and `'close'`) after `callback` has been
 * invoked. The reason for this is so that unexpected `'error'` events (due to
 * incorrect stream implementations) do not cause unexpected crashes.
 * If this is unwanted behavior then the returned cleanup function needs to be
 * invoked in the callback:
 *
 * ```js
 * const cleanup = finished(rs, (err) => {
 *   cleanup();
 *   // ...
 * });
 * ```
 * @since v10.0.0
 * @param stream A readable and/or writable stream.
 * @param callback A callback function that takes an optional error argument.
 * @returns A cleanup function which removes all registered listeners.
 */
external fun finished(
    stream: node.ReadableStream,
    options: _FinishedOptions,
    callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit,
): () -> Unit

/**
 * A readable and/or writable stream/webstream.
 *
 * A function to get notified when a stream is no longer readable, writable
 * or has experienced an error or a premature close event.
 *
 * ```js
 * import { finished } from 'node:stream';
 * import fs from 'node:fs';
 *
 * const rs = fs.createReadStream('archive.tar');
 *
 * finished(rs, (err) => {
 *   if (err) {
 *     console.error('Stream failed.', err);
 *   } else {
 *     console.log('Stream is done reading.');
 *   }
 * });
 *
 * rs.resume(); // Drain the stream.
 * ```
 *
 * Especially useful in error handling scenarios where a stream is destroyed
 * prematurely (like an aborted HTTP request), and will not emit `'end'` or `'finish'`.
 *
 * The `finished` API provides [`promise version`](https://nodejs.org/docs/latest-v24.x/api/stream.html#streamfinishedstream-options).
 *
 * `stream.finished()` leaves dangling event listeners (in particular `'error'`, `'end'`, `'finish'` and `'close'`) after `callback` has been
 * invoked. The reason for this is so that unexpected `'error'` events (due to
 * incorrect stream implementations) do not cause unexpected crashes.
 * If this is unwanted behavior then the returned cleanup function needs to be
 * invoked in the callback:
 *
 * ```js
 * const cleanup = finished(rs, (err) => {
 *   cleanup();
 *   // ...
 * });
 * ```
 * @since v10.0.0
 * @param stream A readable and/or writable stream.
 * @param callback A callback function that takes an optional error argument.
 * @returns A cleanup function which removes all registered listeners.
 */
external fun finished(
    stream: node.WritableStream,
    options: _FinishedOptions,
    callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit,
): () -> Unit

/**
 * A readable and/or writable stream/webstream.
 *
 * A function to get notified when a stream is no longer readable, writable
 * or has experienced an error or a premature close event.
 *
 * ```js
 * import { finished } from 'node:stream';
 * import fs from 'node:fs';
 *
 * const rs = fs.createReadStream('archive.tar');
 *
 * finished(rs, (err) => {
 *   if (err) {
 *     console.error('Stream failed.', err);
 *   } else {
 *     console.log('Stream is done reading.');
 *   }
 * });
 *
 * rs.resume(); // Drain the stream.
 * ```
 *
 * Especially useful in error handling scenarios where a stream is destroyed
 * prematurely (like an aborted HTTP request), and will not emit `'end'` or `'finish'`.
 *
 * The `finished` API provides [`promise version`](https://nodejs.org/docs/latest-v24.x/api/stream.html#streamfinishedstream-options).
 *
 * `stream.finished()` leaves dangling event listeners (in particular `'error'`, `'end'`, `'finish'` and `'close'`) after `callback` has been
 * invoked. The reason for this is so that unexpected `'error'` events (due to
 * incorrect stream implementations) do not cause unexpected crashes.
 * If this is unwanted behavior then the returned cleanup function needs to be
 * invoked in the callback:
 *
 * ```js
 * const cleanup = finished(rs, (err) => {
 *   cleanup();
 *   // ...
 * });
 * ```
 * @since v10.0.0
 * @param stream A readable and/or writable stream.
 * @param callback A callback function that takes an optional error argument.
 * @returns A cleanup function which removes all registered listeners.
 */
external fun finished(
    stream: node.ReadWriteStream,
    options: _FinishedOptions,
    callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit,
): () -> Unit

external fun finished(
    stream: node.ReadableStream,
    callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit,
): () -> Unit

external fun finished(
    stream: node.WritableStream,
    callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit,
): () -> Unit

external fun finished(
    stream: node.ReadWriteStream,
    callback: (err: node.ErrnoException? /* use undefined for default */) -> Unit,
): () -> Unit
