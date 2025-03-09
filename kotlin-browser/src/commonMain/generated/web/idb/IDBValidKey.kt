// Automatically generated - do not modify!

package web.idb

import js.array.ReadonlyArray
import js.buffer.BufferSource
import js.date.Date
import js.reflect.unsafeCast

sealed external interface IDBValidKey

inline fun IDBValidKey(
    value: Number,
): IDBValidKey =
    unsafeCast(value)

inline fun IDBValidKey(
    value: String,
): IDBValidKey =
    unsafeCast(value)

inline fun IDBValidKey(
    value: Date,
): IDBValidKey =
    unsafeCast(value)

inline fun IDBValidKey(
    value: BufferSource,
): IDBValidKey =
    unsafeCast(value)

inline fun IDBValidKey(
    value: ReadonlyArray<IDBValidKey>,
): IDBValidKey =
    unsafeCast(value)
