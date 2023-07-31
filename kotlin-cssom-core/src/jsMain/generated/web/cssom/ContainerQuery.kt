// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

sealed external interface ContainerQuery

inline fun ContainerQuery(
    value: String,
): ContainerQuery =
    value.unsafeCast<ContainerQuery>()

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
