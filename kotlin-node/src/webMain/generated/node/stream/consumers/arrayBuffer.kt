// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import js.buffer.ArrayBuffer
import js.iterable.AsyncIterable
import js.promise.Promise
import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@JsName("arrayBuffer")
external fun arrayBufferAsync(stream: WebReadableStream<*>): Promise<ArrayBuffer>

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@JsName("arrayBuffer")
external fun arrayBufferAsync(stream: node.ReadableStream): Promise<ArrayBuffer>

/**
 * @since v16.7.0
 * @returns Fulfills with an `ArrayBuffer` containing the full contents of the stream.
 */
@JsName("arrayBuffer")
external fun arrayBufferAsync(stream: AsyncIterable<Any?>): Promise<ArrayBuffer>
