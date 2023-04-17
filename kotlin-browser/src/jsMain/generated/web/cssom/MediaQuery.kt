// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

external interface MediaQuery

inline fun MediaQuery(
    value: String,
): MediaQuery =
    value.unsafeCast<MediaQuery>()

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
