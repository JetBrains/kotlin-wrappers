// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.idb

import js.buffer.BufferSource
import js.core.ReadonlyArray
import kotlin.js.Date

sealed external interface IDBValidKey

inline fun IDBValidKey(
    value: Number,
): IDBValidKey =
    value.unsafeCast<IDBValidKey>()

inline fun IDBValidKey(
    value: String,
): IDBValidKey =
    value.unsafeCast<IDBValidKey>()

inline fun IDBValidKey(
    value: Date,
): IDBValidKey =
    value.unsafeCast<IDBValidKey>()

inline fun IDBValidKey(
    value: BufferSource,
): IDBValidKey =
    value.unsafeCast<IDBValidKey>()

inline fun IDBValidKey(
    value: ReadonlyArray<IDBValidKey>,
): IDBValidKey =
    value.unsafeCast<IDBValidKey>()
