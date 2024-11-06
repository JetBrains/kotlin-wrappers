// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

external interface MediaQuery

inline fun MediaQuery(
    value: String,
): MediaQuery =
    unsafeCast(value)

infix fun MediaQuery.and(
    other: MediaQuery,
): MediaQuery =
    MediaQuery("$this and $other")

infix fun MediaQuery.or(
    other: MediaQuery,
): MediaQuery =
    MediaQuery("$this or $other")

inline fun not(
    query: MediaQuery,
): MediaQuery =
    MediaQuery("(not ($query))")
