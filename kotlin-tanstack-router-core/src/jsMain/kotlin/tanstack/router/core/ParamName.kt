package tanstack.router.core

import js.reflect.unsafeCast

sealed external interface ParamName

inline fun ParamName(
    value: String,
): ParamName =
    unsafeCast(value)
