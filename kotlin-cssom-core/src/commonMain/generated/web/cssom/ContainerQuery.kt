// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface ContainerQuery

inline fun ContainerQuery(
    value: String,
): ContainerQuery =
    unsafeCast(value)

infix fun ContainerQuery.and(
    other: ContainerQuery,
): ContainerQuery =
    ContainerQuery("$this and $other")

infix fun ContainerQuery.or(
    other: ContainerQuery,
): ContainerQuery =
    ContainerQuery("$this or $other")

inline fun not(
    query: ContainerQuery,
): ContainerQuery =
    ContainerQuery("(not ($query))")
