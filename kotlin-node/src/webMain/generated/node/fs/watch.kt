// Automatically generated - do not modify!

@file:JsModule("node:fs")

package node.fs

import node.buffer.NonSharedBuffer

/**
 * Watch for changes on `filename`, where `filename` is either a file or a
 * directory.
 *
 * The second argument is optional. If `options` is provided as a string, it
 * specifies the `encoding`. Otherwise `options` should be passed as an object.
 *
 * The listener callback gets two arguments `(eventType, filename)`. `eventType`is either `'rename'` or `'change'`, and `filename` is the name of the file
 * which triggered the event.
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * The listener callback is attached to the `'change'` event fired by `fs.FSWatcher`, but it is not the same thing as the `'change'` value of `eventType`.
 *
 * If a `signal` is passed, aborting the corresponding AbortController will close
 * the returned `fs.FSWatcher`.
 * @since v0.5.10
 * @param listener
 */

/**
 * Watch for changes on `filename`, where `filename` is either a file or a
 * directory.
 *
 * The second argument is optional. If `options` is provided as a string, it
 * specifies the `encoding`. Otherwise `options` should be passed as an object.
 *
 * The listener callback gets two arguments `(eventType, filename)`. `eventType`is either `'rename'` or `'change'`, and `filename` is the name of the file
 * which triggered the event.
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * The listener callback is attached to the `'change'` event fired by `fs.FSWatcher`, but it is not the same thing as the `'change'` value of `eventType`.
 *
 * If a `signal` is passed, aborting the corresponding AbortController will close
 * the returned `fs.FSWatcher`.
 * @since v0.5.10
 * @param listener
 */
external fun watch(
    filename: PathLike,
    options: _WatchOptionsWithStringEncoding? = definedExternally,
    listener: WatchListener<String> = definedExternally,
): FSWatcher

/**
 * Watch for changes on `filename`, where `filename` is either a file or a
 * directory.
 *
 * The second argument is optional. If `options` is provided as a string, it
 * specifies the `encoding`. Otherwise `options` should be passed as an object.
 *
 * The listener callback gets two arguments `(eventType, filename)`. `eventType`is either `'rename'` or `'change'`, and `filename` is the name of the file
 * which triggered the event.
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * The listener callback is attached to the `'change'` event fired by `fs.FSWatcher`, but it is not the same thing as the `'change'` value of `eventType`.
 *
 * If a `signal` is passed, aborting the corresponding AbortController will close
 * the returned `fs.FSWatcher`.
 * @since v0.5.10
 * @param listener
 */
external fun watch(
    filename: PathLike,
    options: node.buffer.BufferEncoding? = definedExternally,
    listener: WatchListener<String> = definedExternally,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: _WatchOptionsWithBufferEncoding,
    listener: WatchListener<NonSharedBuffer>,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: String, /* "buffer" */
    listener: WatchListener<NonSharedBuffer>,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: _WatchOptions?,
    listener: WatchListener<Any /* string | NonSharedBuffer */>,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: node.buffer.BufferEncoding?,
    listener: WatchListener<Any /* string | NonSharedBuffer */>,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: String /* "buffer" */?,
    listener: WatchListener<Any /* string | NonSharedBuffer */>,
): FSWatcher

external fun watch(
    filename: PathLike,
    listener: WatchListener<String>,
): FSWatcher
