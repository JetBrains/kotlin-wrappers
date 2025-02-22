// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface TransformOrigin

inline fun TransformOrigin(
    offsetX: GeometryPosition,
    offsetY: GeometryPosition,
): TransformOrigin =
    unsafeCast("$offsetX $offsetY")

inline fun TransformOrigin(
    offsetX: GeometryPosition,
    offsetY: GeometryPosition,
    offsetZ: Length,
): TransformOrigin =
    unsafeCast("$offsetX $offsetY $offsetZ")
