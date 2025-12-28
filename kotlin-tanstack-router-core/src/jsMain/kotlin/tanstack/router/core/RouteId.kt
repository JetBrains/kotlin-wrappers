package tanstack.router.core

import js.reflect.unsafeCast

sealed external interface RouteId

inline fun RouteId(
    value: String,
): RouteId =
    unsafeCast(value)
