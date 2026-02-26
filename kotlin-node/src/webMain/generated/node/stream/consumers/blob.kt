// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import web.blob.Blob as NodeBlob
import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@JsName("blob")
external fun blobAsync(stream: WebReadableStream<*>): js.promise.Promise<NodeBlob>

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@JsName("blob")
external fun blobAsync(stream: node.ReadableStream): js.promise.Promise<NodeBlob>

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@JsName("blob")
external fun blobAsync(stream: js.iterable.AsyncIterable<Any?>): js.promise.Promise<NodeBlob>
