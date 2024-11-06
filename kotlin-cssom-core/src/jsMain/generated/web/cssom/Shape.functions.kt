// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

inline fun circle(): BasicShape =
    unsafeCast("circle()")

inline fun circle(
    r: ShapeRadius,
): BasicShape =
    unsafeCast("circle($r)")

inline fun circle(
    r: ShapeRadius,
    c: GeometryPosition,
): BasicShape =
    unsafeCast("circle($r at $c)")

inline fun circle(
    r: ShapeRadius,
    cx: GeometryPosition,
    cy: GeometryPosition,
): BasicShape =
    unsafeCast("circle($r at $cx $cy)")

inline fun ellipse(): BasicShape =
    unsafeCast("ellipse()")

inline fun ellipse(
    rx: ShapeRadius,
    ry: ShapeRadius,
): BasicShape =
    unsafeCast("ellipse($rx $ry)")

inline fun ellipse(
    rx: ShapeRadius,
    ry: ShapeRadius,
    c: GeometryPosition,
): BasicShape =
    unsafeCast("ellipse($rx $ry at $c)")

inline fun ellipse(
    rx: ShapeRadius,
    ry: ShapeRadius,
    cx: GeometryPosition,
    cy: GeometryPosition,
): BasicShape =
    unsafeCast("ellipse($rx $ry at $cx $cy)")

inline fun inset(
    vertical: Length,
    horizontal: Length,
): BasicShape =
    unsafeCast("inset($vertical $horizontal)")

inline fun inset(
    top: Length,
    horizontal: Length,
    bottom: Length,
): BasicShape =
    unsafeCast("inset($top $horizontal $bottom)")

inline fun inset(
    top: Length,
    right: Length,
    bottom: Length,
    left: Length,
): BasicShape =
    unsafeCast("inset($top $right $bottom $left)")

inline fun inset(
    value: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    unsafeCast("inset($value $round $borderRadius)")

inline fun inset(
    vertical: Length,
    horizontal: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    unsafeCast("inset($vertical $horizontal $round $borderRadius)")

inline fun inset(
    top: Length,
    horizontal: Length,
    bottom: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    unsafeCast("inset($top $horizontal $bottom $round $borderRadius)")

inline fun inset(
    top: Length,
    right: Length,
    bottom: Length,
    left: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    unsafeCast("inset($top $right $bottom $left $round $borderRadius)")

inline fun path(
    d: String,
): BasicShape =
    unsafeCast("path($d)")
