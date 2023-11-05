// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

sealed external interface BoxShadow

@JsUnion
sealed external interface BoxShadowInset {
    companion object {
        @JsValue("inset")
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
