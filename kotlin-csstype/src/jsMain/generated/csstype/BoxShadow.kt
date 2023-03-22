// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package csstype

sealed external interface BoxShadow

// language=JavaScript
@JsName("""(/*union*/{inset: 'inset'}/*union*/)""")
sealed external interface BoxShadowInset {
    companion object {
        val inset: BoxShadowInset
    }
}

inline fun BoxShadow(
    offsetX: Length,
    offsetY: Length,
    color: Color,
): BoxShadow =
    "$offsetX $offsetY $color".unsafeCast<BoxShadow>()

inline fun BoxShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): BoxShadow =
    "$offsetX $offsetY $blurRadius $color".unsafeCast<BoxShadow>()

inline fun BoxShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    spreadRadius: Length,
    color: Color,
): BoxShadow =
    "$offsetX $offsetY $blurRadius $spreadRadius $color".unsafeCast<BoxShadow>()

inline fun BoxShadow(
    inset: BoxShadowInset,
    offsetX: Length,
    offsetY: Length,
    color: Color,
): BoxShadow =
    "$inset $offsetX $offsetY $color".unsafeCast<BoxShadow>()

inline fun BoxShadow(
    inset: BoxShadowInset,
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): BoxShadow =
    "$inset $offsetX $offsetY $blurRadius $color".unsafeCast<BoxShadow>()

inline fun BoxShadow(
    inset: BoxShadowInset,
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    spreadRadius: Length,
    color: Color,
): BoxShadow =
    "$inset $offsetX $offsetY $blurRadius $spreadRadius $color".unsafeCast<BoxShadow>()
