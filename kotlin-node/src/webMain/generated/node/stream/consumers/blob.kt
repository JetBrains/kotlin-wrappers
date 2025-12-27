// Automatically generated - do not modify!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import js.iterable.AsyncIterable
import js.promise.Promise
import web.blob.Blob as NodeBlob
import web.streams.ReadableStream as WebReadableStream

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@JsName("blob")
external fun blobAsync(stream: WebReadableStream<*>): Promise<NodeBlob>

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@JsName("blob")
external fun blobAsync(stream: node.ReadableStream): Promise<NodeBlob>

/**
 * @since v16.7.0
 * @returns Fulfills with a `Blob` containing the full contents of the stream.
 */
@JsName("blob")
external fun blobAsync(stream: AsyncIterable<Any?>): Promise<NodeBlob>
