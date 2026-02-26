// Automatically generated - do not modify!

package node.stream.consumers

import web.streams.ReadableStream as WebReadableStream

@seskar.js.JsAsync
external suspend fun arrayBuffer(stream: WebReadableStream<*>): js.buffer.ArrayBuffer

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@seskar.js.JsAsync
external suspend fun arrayBuffer(stream: node.ReadableStream): js.buffer.ArrayBuffer

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@seskar.js.JsAsync
external suspend fun arrayBuffer(stream: js.iterable.AsyncIterable<Any?>): js.buffer.ArrayBuffer
