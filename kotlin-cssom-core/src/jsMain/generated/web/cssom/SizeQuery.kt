// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

external interface SizeQuery :
    ContainerQuery,
    MediaQuery

inline fun SizeQuery(
    value: String,
): SizeQuery =
    value.unsafeCast<SizeQuery>()

infix fun SizeQuery.and(
    other: SizeQuery,
): SizeQuery =
    SizeQuery("$this and $other")

infix fun SizeQuery.or(
    other: SizeQuery,
): SizeQuery =
    SizeQuery("$this or $other")

inline fun not(
    query: SizeQuery,
): SizeQuery =
    SizeQuery("(not ($query))")
