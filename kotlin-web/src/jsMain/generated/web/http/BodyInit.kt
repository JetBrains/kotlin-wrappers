// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.http

import js.buffer.BufferSource
import web.buffer.Blob
import web.form.FormData
import web.streams.ReadableStream
import web.url.URLSearchParams

sealed external interface BodyInit

inline fun BodyInit(
    value: ReadableStream<*>,
): BodyInit =
    value.unsafeCast<BodyInit>()

inline fun BodyInit(
    value: Blob,
): BodyInit =
    value.unsafeCast<BodyInit>()

inline fun BodyInit(
    value: BufferSource,
): BodyInit =
    value.unsafeCast<BodyInit>()

inline fun BodyInit(
    value: FormData,
): BodyInit =
    value.unsafeCast<BodyInit>()

inline fun BodyInit(
    value: URLSearchParams,
): BodyInit =
    value.unsafeCast<BodyInit>()

inline fun BodyInit(
    value: String,
): BodyInit =
    value.unsafeCast<BodyInit>()
