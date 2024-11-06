// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

sealed external interface Ident :
    IdentType

sealed external interface IdentType :
    AnimationName,
    ContainerName,
    GridArea,
    ScrollTimelineName,
    TransitionProperty,
    ViewTransitionName,
    WillChange

inline fun ident(
    value: String,
): Ident =
    unsafeCast(value)
