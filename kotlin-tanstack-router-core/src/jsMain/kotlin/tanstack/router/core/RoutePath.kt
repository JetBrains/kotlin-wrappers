package tanstack.router.core

import js.reflect.unsafeCast

sealed external interface RoutePath

inline fun RoutePath(
    value: String,
): RoutePath =
    unsafeCast(value)
