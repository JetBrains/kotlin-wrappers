// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface TransformFunction :
    Transform

inline fun matrix(
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    tx: Double,
    ty: Double,
): TransformFunction =
    unsafeCast("matrix($a,$b,$c,$d,$tx,$ty)")

inline fun matrix3d(
    a1: Double,
    b1: Double,
    c1: Double,
    d1: Double,
    a2: Double,
    b2: Double,
    c2: Double,
    d2: Double,
    a3: Double,
    b3: Double,
    c3: Double,
    d3: Double,
    a4: Double,
    b4: Double,
    c4: Double,
    d4: Double,
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
    a: Double,
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
    sx: Double,
): TransformFunction =
    unsafeCast("scale($sx)")

inline fun scale(
    sx: Double,
    sy: Double,
): TransformFunction =
    unsafeCast("scale($sx,$sy)")

inline fun scale3d(
    sx: Double,
    sy: Double,
    sz: Double,
): TransformFunction =
    unsafeCast("scale3d($sx,$sy,$sz)")

inline fun scalex(
    sx: Double,
): TransformFunction =
    unsafeCast("scalex($sx)")

inline fun scaley(
    sy: Double,
): TransformFunction =
    unsafeCast("scaley($sy)")

inline fun scalez(
    sz: Double,
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
