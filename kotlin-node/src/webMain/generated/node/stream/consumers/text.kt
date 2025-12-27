// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import js.iterable.AsyncIterable
import js.promise.Promise
import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@JsName("text")
external fun textAsync(stream: WebReadableStream<*>): Promise<String>

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@JsName("text")
external fun textAsync(stream: node.ReadableStream): Promise<String>

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@JsName("text")
external fun textAsync(stream: AsyncIterable<Any?>): Promise<String>
