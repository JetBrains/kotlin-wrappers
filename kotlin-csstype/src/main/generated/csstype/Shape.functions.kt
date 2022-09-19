// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

inline fun circle(): BasicShape =
    "circle()".unsafeCast<BasicShape>()

inline fun circle(
    r: ShapeRadius,
): BasicShape =
    "circle($r)".unsafeCast<BasicShape>()

inline fun circle(
    r: ShapeRadius,
    c: GeometryPosition,
): BasicShape =
    "circle($r at $c)".unsafeCast<BasicShape>()

inline fun circle(
    r: ShapeRadius,
    cx: GeometryPosition,
    cy: GeometryPosition,
): BasicShape =
    "circle($r at $cx $cy)".unsafeCast<BasicShape>()

inline fun ellipse(): BasicShape =
    "ellipse()".unsafeCast<BasicShape>()

inline fun ellipse(
    rx: ShapeRadius,
    ry: ShapeRadius,
): BasicShape =
    "ellipse($rx $ry)".unsafeCast<BasicShape>()

inline fun ellipse(
    rx: ShapeRadius,
    ry: ShapeRadius,
    c: GeometryPosition,
): BasicShape =
    "ellipse($rx $ry at $c)".unsafeCast<BasicShape>()

inline fun ellipse(
    rx: ShapeRadius,
    ry: ShapeRadius,
    cx: GeometryPosition,
    cy: GeometryPosition,
): BasicShape =
    "ellipse($rx $ry at $cx $cy)".unsafeCast<BasicShape>()

inline fun inset(
    vertical: Length,
    horizontal: Length,
): BasicShape =
    "inset($vertical $horizontal)".unsafeCast<BasicShape>()

inline fun inset(
    top: Length,
    horizontal: Length,
    bottom: Length,
): BasicShape =
    "inset($top $horizontal $bottom)".unsafeCast<BasicShape>()

inline fun inset(
    top: Length,
    right: Length,
    bottom: Length,
    left: Length,
): BasicShape =
    "inset($top $right $bottom $left)".unsafeCast<BasicShape>()

inline fun inset(
    value: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    "inset($value $round $borderRadius)".unsafeCast<BasicShape>()

inline fun inset(
    vertical: Length,
    horizontal: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    "inset($vertical $horizontal $round $borderRadius)".unsafeCast<BasicShape>()

inline fun inset(
    top: Length,
    horizontal: Length,
    bottom: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    "inset($top $horizontal $bottom $round $borderRadius)".unsafeCast<BasicShape>()

inline fun inset(
    top: Length,
    right: Length,
    bottom: Length,
    left: Length,
    round: Round,
    borderRadius: Length,
): BasicShape =
    "inset($top $right $bottom $left $round $borderRadius)".unsafeCast<BasicShape>()

inline fun path(
    d: String,
): BasicShape =
    "path($d)".unsafeCast<BasicShape>()
