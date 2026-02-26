// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import node.buffer.NonSharedBuffer
import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with a `Buffer` containing the full contents of the stream.
 */
@JsName("buffer")
external fun bufferAsync(stream: WebReadableStream<*>): js.promise.Promise<NonSharedBuffer>

/**
 * @since v16.7.0
 * @returns Fulfills with a `Buffer` containing the full contents of the stream.
 */
@JsName("buffer")
external fun bufferAsync(stream: node.ReadableStream): js.promise.Promise<NonSharedBuffer>

/**
 * @since v16.7.0
 * @returns Fulfills with a `Buffer` containing the full contents of the stream.
 */
@JsName("buffer")
external fun bufferAsync(stream: js.iterable.AsyncIterable<Any?>): js.promise.Promise<NonSharedBuffer>
