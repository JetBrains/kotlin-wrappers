// Automatically generated - do not modify!

package web.http

import js.array.ReadonlyArray
import js.array.Tuple2
import js.internal.InternalApi
import js.objects.ReadonlyRecord
import js.reflect.unsafeCast
import kotlin.js.JsString

@SubclassOptInRequired(InternalApi::class)
external interface HeadersInit

inline fun HeadersInit(
    value: ReadonlyArray<Tuple2<JsString, JsString>>,
): HeadersInit =
    unsafeCast(value)

inline fun HeadersInit(
    value: ReadonlyRecord<JsString, JsString>,
): HeadersInit =
    unsafeCast(value)
