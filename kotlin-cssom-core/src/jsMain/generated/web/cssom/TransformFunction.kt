// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

sealed external interface TransformFunction :
    Transform

inline fun matrix(
    a: Number,
    b: Number,
    c: Number,
    d: Number,
    tx: Number,
    ty: Number,
): TransformFunction =
    unsafeCast("matrix($a,$b,$c,$d,$tx,$ty)")

inline fun matrix3d(
    a1: Number,
    b1: Number,
    c1: Number,
    d1: Number,
    a2: Number,
    b2: Number,
    c2: Number,
    d2: Number,
    a3: Number,
    b3: Number,
    c3: Number,
    d3: Number,
    a4: Number,
    b4: Number,
    c4: Number,
    d4: Number,
): TransformFunction =
    unsafeCast("matrix3d($a1,$b1,$c1,$d1,$a2,$b2,$c2,$d2,$a3,$b3,$c3,$d3,$a4,$b4,$c4,$d4)")

inline fun perspective(
    d: Length,
): TransformFunction =
    unsafeCast("perspective($d)")

inline fun rotate(
    a: Angle,
): TransformFunction =
    unsafeCast("rotate($a)")

inline fun rotate3d(
    a: Number,
): TransformFunction =
    unsafeCast("rotate3d($a)")

inline fun rotate3d(
    x: Number,
    y: Number,
    z: Number,
    a: Angle,
): TransformFunction =
    unsafeCast("rotate3d($x,$y,$z,$a)")

inline fun rotatex(
    a: Angle,
): TransformFunction =
    unsafeCast("rotatex($a)")

inline fun rotatey(
    a: Angle,
): TransformFunction =
    unsafeCast("rotatey($a)")

inline fun rotatez(
    a: Angle,
): TransformFunction =
    unsafeCast("rotatez($a)")

inline fun scale(
    sx: Number,
): TransformFunction =
    unsafeCast("scale($sx)")

inline fun scale(
    sx: Number,
    sy: Number,
): TransformFunction =
    unsafeCast("scale($sx,$sy)")

inline fun scale3d(
    sx: Number,
    sy: Number,
    sz: Number,
): TransformFunction =
    unsafeCast("scale3d($sx,$sy,$sz)")

inline fun scalex(
    sx: Number,
): TransformFunction =
    unsafeCast("scalex($sx)")

inline fun scaley(
    sy: Number,
): TransformFunction =
    unsafeCast("scaley($sy)")

inline fun scalez(
    sz: Number,
): TransformFunction =
    unsafeCast("scalez($sz)")

inline fun skew(
    ax: Angle,
): TransformFunction =
    unsafeCast("skew($ax)")

inline fun skew(
    ax: Angle,
    ay: Angle,
): TransformFunction =
    unsafeCast("skew($ax,$ay)")

inline fun skewx(
    a: Angle,
): TransformFunction =
    unsafeCast("skewx($a)")

inline fun skewy(
    a: Angle,
): TransformFunction =
    unsafeCast("skewy($a)")

inline fun translate(
    tx: Length,
): TransformFunction =
    unsafeCast("translate($tx)")

inline fun translate(
    tx: Length,
    ty: Length,
): TransformFunction =
    unsafeCast("translate($tx,$ty)")

inline fun translate3d(
    tx: Length,
    ty: Length,
    tz: Length,
): TransformFunction =
    unsafeCast("translate3d($tx,$ty,$tz)")

inline fun translatex(
    tx: Length,
): TransformFunction =
    unsafeCast("translatex($tx)")

inline fun translatey(
    ty: Length,
): TransformFunction =
    unsafeCast("translatey($ty)")

inline fun translatez(
    tz: Length,
): TransformFunction =
    unsafeCast("translatez($tz)")
