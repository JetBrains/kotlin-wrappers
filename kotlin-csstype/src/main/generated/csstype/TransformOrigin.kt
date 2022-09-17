// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

// language=JavaScript
@JsName("""(/*union*/{bottom: 'bottom', center: 'center', left: 'left', right: 'right', top: 'top'}/*union*/)""")
sealed external interface TransformOrigin {

    interface OffsetKeyword : TransformOrigin

    companion object {
        val bottom: OffsetKeyword
        val center: OffsetKeyword
        val left: OffsetKeyword
        val right: OffsetKeyword
        val top: OffsetKeyword
    }
}

inline fun TransformOrigin(
    xOffset: Length,
    yOffset: Length,
): TransformOrigin =
    "$xOffset $yOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: TransformOrigin.OffsetKeyword,
    yOffset: Length,
): TransformOrigin =
    "$xOffsetKeyword $yOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: TransformOrigin.OffsetKeyword,
    yOffsetKeyword: TransformOrigin.OffsetKeyword,
): TransformOrigin =
    "$xOffsetKeyword $yOffsetKeyword".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffset: Length,
    yOffset: Length,
    zOffset: Length,
): TransformOrigin =
    "$xOffset $yOffset $zOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: TransformOrigin.OffsetKeyword,
    yOffset: Length,
    zOffset: Length,
): TransformOrigin =
    "$xOffsetKeyword $yOffset $zOffset".unsafeCast<TransformOrigin>()

inline fun TransformOrigin(
    xOffsetKeyword: TransformOrigin.OffsetKeyword,
    yOffsetKeyword: TransformOrigin.OffsetKeyword,
    zOffset: Length,
): TransformOrigin =
    "$xOffsetKeyword $yOffsetKeyword $zOffset".unsafeCast<TransformOrigin>()
