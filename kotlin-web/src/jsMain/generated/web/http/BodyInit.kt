// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.http

import js.buffer.BufferSource
import js.reflect.unsafeCast
import web.blob.Blob
import web.form.FormData
import web.streams.ReadableStream
import web.url.URLSearchParams

sealed external interface BodyInit

inline fun BodyInit(
    value: ReadableStream<*>,
): BodyInit =
    unsafeCast(value)

inline fun BodyInit(
    value: Blob,
): BodyInit =
    unsafeCast(value)

inline fun BodyInit(
    value: BufferSource,
): BodyInit =
    unsafeCast(value)

inline fun BodyInit(
    value: FormData,
): BodyInit =
    unsafeCast(value)

inline fun BodyInit(
    value: URLSearchParams,
): BodyInit =
    unsafeCast(value)

inline fun BodyInit(
    value: String,
): BodyInit =
    unsafeCast(value)
