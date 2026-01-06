package tanstack.router.core

import js.reflect.unsafeCast

sealed external interface RoutePath

inline fun RoutePath(
    value: String,
): RoutePath =
    unsafeCast(value)

inline fun RoutePath(
    segment1: String,
    paramName1: ParamName,
): RoutePath =
    RoutePath("$segment1$$paramName1")

inline fun RoutePath(
    segment1: String,
    paramName1: ParamName,
    segment2: String,
): RoutePath =
    RoutePath("$segment1$$paramName1$segment2")

inline fun RoutePath(
    segment1: String,
    paramName1: ParamName,
    segment2: String,
    paramName2: ParamName,
): RoutePath =
    RoutePath("$segment1$$paramName1$segment2$$paramName2")
