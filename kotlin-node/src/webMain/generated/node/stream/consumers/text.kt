// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@JsName("text")
external fun textAsync(stream: WebReadableStream<*>): js.promise.Promise<String>

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@JsName("text")
external fun textAsync(stream: node.ReadableStream): js.promise.Promise<String>

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@JsName("text")
external fun textAsync(stream: js.iterable.AsyncIterable<Any?>): js.promise.Promise<String>
