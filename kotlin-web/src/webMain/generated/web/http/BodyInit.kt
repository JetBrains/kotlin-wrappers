// Automatically generated - do not modify!

package web.http

import js.buffer.BufferSource
import js.internal.InternalApi
import js.reflect.unsafeCast
import web.blob.Blob
import web.form.FormData
import web.streams.ReadableStream
import web.url.URLSearchParams

/**
 * Union of:
 * - [ReadableStream]
 * - [Blob]
 * - [BufferSource]
 * - [FormData]
 * - [URLSearchParams]
 * - [String]
 */
@SubclassOptInRequired(InternalApi::class)
external interface BodyInit

inline fun BodyInit(
    value: String,
): BodyInit =
    unsafeCast(value)

inline fun BodyInit(
    value: BufferSource,
): BodyInit =
    unsafeCast(value)
