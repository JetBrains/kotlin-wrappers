// Automatically generated - do not modify!

package node.stream.consumers

import js.iterable.AsyncIterable
import web.streams.ReadableStream as WebReadableStream

@seskar.js.JsAsync
external suspend fun text(stream: WebReadableStream<*>): String

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@seskar.js.JsAsync
external suspend fun text(stream: node.ReadableStream): String

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a UTF-8 encoded string.
 */
@seskar.js.JsAsync
external suspend fun text(stream: AsyncIterable<Any?>): String
