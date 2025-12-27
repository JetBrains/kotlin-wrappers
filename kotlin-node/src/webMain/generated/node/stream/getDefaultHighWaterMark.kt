// Automatically generated - do not modify!

@file:JsModule("node:stream")
@file:JsQualifier("Stream")

package node.stream

/**
 * Returns the default highWaterMark used by streams.
 * Defaults to `65536` (64 KiB), or `16` for `objectMode`.
 * @since v19.9.0
 */
external fun getDefaultHighWaterMark(objectMode: Boolean): Double
