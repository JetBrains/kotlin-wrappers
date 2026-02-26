// Automatically generated - do not modify!

package node.stream.consumers

import web.blob.Blob as NodeBlob
import web.streams.ReadableStream as WebReadableStream

@seskar.js.JsAsync
external suspend fun blob(stream: WebReadableStream<*>): NodeBlob

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@seskar.js.JsAsync
external suspend fun blob(stream: node.ReadableStream): NodeBlob

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@seskar.js.JsAsync
external suspend fun blob(stream: js.iterable.AsyncIterable<Any?>): NodeBlob
