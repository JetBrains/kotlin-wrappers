// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a
 * UTF-8 encoded string that is then passed through `JSON.parse()`.
 */
@JsName("json")
external fun jsonAsync(stream: WebReadableStream<*>): js.promise.Promise<Any?>

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a
 * UTF-8 encoded string that is then passed through `JSON.parse()`.
 */
@JsName("json")
external fun jsonAsync(stream: node.ReadableStream): js.promise.Promise<Any?>

/**
 * @since v16.7.0
 * @returns Fulfills with the contents of the stream parsed as a
 * UTF-8 encoded string that is then passed through `JSON.parse()`.
 */
@JsName("json")
external fun jsonAsync(stream: js.iterable.AsyncIterable<Any?>): js.promise.Promise<Any?>
