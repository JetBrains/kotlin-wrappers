// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""(/*union*/{none: 'none'}/*union*/)""")
sealed external interface Filter {
    companion object {
        val none: Filter
    }
}

inline fun blur(
    value: Number,
): Filter =
    "blur($value)".unsafeCast<Filter>()

inline fun blur(
    value: Length,
): Filter =
    "blur($value)".unsafeCast<Filter>()

inline fun brightness(
    value: Number,
): Filter =
    "brightness($value)".unsafeCast<Filter>()

inline fun brightness(
    value: Percent,
): Filter =
    "brightness($value)".unsafeCast<Filter>()

inline fun contrast(
    value: Number,
): Filter =
    "contrast($value)".unsafeCast<Filter>()

inline fun contrast(
    value: Percent,
): Filter =
    "contrast($value)".unsafeCast<Filter>()

inline fun dropShadow(
    value: String,
): Filter =
    "drop-shadow($value)".unsafeCast<Filter>()

inline fun grayscale(
    value: Number,
): Filter =
    "grayscale($value)".unsafeCast<Filter>()

inline fun grayscale(
    value: Percent,
): Filter =
    "grayscale($value)".unsafeCast<Filter>()

inline fun hueRotate(
    value: Number,
): Filter =
    "hue-rotate($value)".unsafeCast<Filter>()

inline fun hueRotate(
    value: Angle,
): Filter =
    "hue-rotate($value)".unsafeCast<Filter>()

inline fun invert(
    value: Number,
): Filter =
    "invert($value)".unsafeCast<Filter>()

inline fun invert(
    value: Percent,
): Filter =
    "invert($value)".unsafeCast<Filter>()

inline fun opacity(
    value: Number,
): Filter =
    "opacity($value)".unsafeCast<Filter>()

inline fun opacity(
    value: Percent,
): Filter =
    "opacity($value)".unsafeCast<Filter>()

inline fun saturate(
    value: Number,
): Filter =
    "saturate($value)".unsafeCast<Filter>()

inline fun saturate(
    value: Percent,
): Filter =
    "saturate($value)".unsafeCast<Filter>()

inline fun sepia(
    value: Number,
): Filter =
    "sepia($value)".unsafeCast<Filter>()

inline fun sepia(
    value: Percent,
): Filter =
    "sepia($value)".unsafeCast<Filter>()

fun Filter(
    vararg values: Filter,
): Filter =
    values.joinToString(" ")
        .unsafeCast<Filter>()
