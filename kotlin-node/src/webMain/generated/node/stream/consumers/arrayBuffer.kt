// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@JsName("arrayBuffer")
external fun arrayBufferAsync(stream: WebReadableStream<*>): js.promise.Promise<js.buffer.ArrayBuffer>

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@JsName("arrayBuffer")
external fun arrayBufferAsync(stream: node.ReadableStream): js.promise.Promise<js.buffer.ArrayBuffer>

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@JsName("arrayBuffer")
external fun arrayBufferAsync(stream: js.iterable.AsyncIterable<Any?>): js.promise.Promise<js.buffer.ArrayBuffer>
