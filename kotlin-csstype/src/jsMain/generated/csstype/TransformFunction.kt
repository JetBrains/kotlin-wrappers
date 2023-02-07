// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package csstype

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
    "matrix($a,$b,$c,$d,$tx,$ty)".unsafeCast<TransformFunction>()

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
    "matrix3d($a1,$b1,$c1,$d1,$a2,$b2,$c2,$d2,$a3,$b3,$c3,$d3,$a4,$b4,$c4,$d4)".unsafeCast<TransformFunction>()

inline fun perspective(
    d: Length,
): TransformFunction =
    "perspective($d)".unsafeCast<TransformFunction>()

inline fun rotate(
    a: Angle,
): TransformFunction =
    "rotate($a)".unsafeCast<TransformFunction>()

inline fun rotate3d(
    a: Number,
): TransformFunction =
    "rotate3d($a)".unsafeCast<TransformFunction>()

inline fun rotate3d(
    x: Number,
    y: Number,
    z: Number,
    a: Angle,
): TransformFunction =
    "rotate3d($x,$y,$z,$a)".unsafeCast<TransformFunction>()

inline fun rotatex(
    a: Angle,
): TransformFunction =
    "rotatex($a)".unsafeCast<TransformFunction>()

inline fun rotatey(
    a: Angle,
): TransformFunction =
    "rotatey($a)".unsafeCast<TransformFunction>()

inline fun rotatez(
    a: Angle,
): TransformFunction =
    "rotatez($a)".unsafeCast<TransformFunction>()

inline fun scale(
    sx: Number,
): TransformFunction =
    "scale($sx)".unsafeCast<TransformFunction>()

inline fun scale(
    sx: Number,
    sy: Number,
): TransformFunction =
    "scale($sx,$sy)".unsafeCast<TransformFunction>()

inline fun scale3d(
    sx: Number,
    sy: Number,
    sz: Number,
): TransformFunction =
    "scale3d($sx,$sy,$sz)".unsafeCast<TransformFunction>()

inline fun scalex(
    sx: Number,
): TransformFunction =
    "scalex($sx)".unsafeCast<TransformFunction>()

inline fun scaley(
    sy: Number,
): TransformFunction =
    "scaley($sy)".unsafeCast<TransformFunction>()

inline fun scalez(
    sz: Number,
): TransformFunction =
    "scalez($sz)".unsafeCast<TransformFunction>()

inline fun skew(
    ax: Angle,
): TransformFunction =
    "skew($ax)".unsafeCast<TransformFunction>()

inline fun skew(
    ax: Angle,
    ay: Angle,
): TransformFunction =
    "skew($ax,$ay)".unsafeCast<TransformFunction>()

inline fun skewx(
    a: Angle,
): TransformFunction =
    "skewx($a)".unsafeCast<TransformFunction>()

inline fun skewy(
    a: Angle,
): TransformFunction =
    "skewy($a)".unsafeCast<TransformFunction>()

inline fun translate(
    tx: Length,
): TransformFunction =
    "translate($tx)".unsafeCast<TransformFunction>()

inline fun translate(
    tx: Length,
    ty: Length,
): TransformFunction =
    "translate($tx,$ty)".unsafeCast<TransformFunction>()

inline fun translate3d(
    tx: Length,
    ty: Length,
    tz: Length,
): TransformFunction =
    "translate3d($tx,$ty,$tz)".unsafeCast<TransformFunction>()

inline fun translatex(
    tx: Length,
): TransformFunction =
    "translatex($tx)".unsafeCast<TransformFunction>()

inline fun translatey(
    ty: Length,
): TransformFunction =
    "translatey($ty)".unsafeCast<TransformFunction>()

inline fun translatez(
    tz: Length,
): TransformFunction =
    "translatez($tz)".unsafeCast<TransformFunction>()
