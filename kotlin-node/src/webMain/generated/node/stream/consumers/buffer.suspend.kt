// Automatically generated - do not modify!

package node.stream.consumers

import js.iterable.AsyncIterable
import node.buffer.NonSharedBuffer
import web.streams.ReadableStream as WebReadableStream

@seskar.js.JsAsync
external suspend fun buffer(stream: WebReadableStream<*>): NonSharedBuffer

/**
 * @since v16.7.0
 * @returns Fulfills with a `Buffer` containing the full contents of the stream.
 */
@seskar.js.JsAsync
external suspend fun buffer(stream: node.ReadableStream): NonSharedBuffer

/**
 * @since v16.7.0
 * @returns Fulfills with a `Buffer` containing the full contents of the stream.
 */
@seskar.js.JsAsync
external suspend fun buffer(stream: AsyncIterable<Any?>): NonSharedBuffer
