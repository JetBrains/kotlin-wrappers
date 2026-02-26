// Automatically generated - do not modify!

package node.stream.consumers

import web.streams.ReadableStream as WebReadableStream

@seskar.js.JsAsync
external suspend fun json(stream: WebReadableStream<*>): Any?

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a
 * UTF-8 encoded string that is then passed through `JSON.parse()`.
 */
@seskar.js.JsAsync
external suspend fun json(stream: node.ReadableStream): Any?

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a
 * UTF-8 encoded string that is then passed through `JSON.parse()`.
 */
@seskar.js.JsAsync
external suspend fun json(stream: js.iterable.AsyncIterable<Any?>): Any?
