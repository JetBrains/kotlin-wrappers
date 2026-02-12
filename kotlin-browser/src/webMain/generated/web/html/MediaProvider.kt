// Automatically generated - do not modify!

package web.html

import js.internal.InternalApi
import js.reflect.unsafeCast
import web.blob.Blob
import web.mediastreams.MediaStream

/**
 * Union of:
 * - [MediaStream]
 * - [MediaSource]
 * - [Blob]
 */
@SubclassOptInRequired(InternalApi::class)
external interface MediaProvider

inline fun MediaProvider(
    value: Blob,
): MediaProvider =
    unsafeCast(value)
