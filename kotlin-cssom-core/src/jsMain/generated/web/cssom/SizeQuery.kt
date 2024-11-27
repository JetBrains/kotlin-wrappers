// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface SizeQuery :
    ContainerQuery,
    MediaQuery

inline fun SizeQuery(
    value: String,
): SizeQuery =
    unsafeCast(value)

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
