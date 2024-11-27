// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast
import seskar.js.JsValue

sealed external interface BoxShadow

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
    unsafeCast("$offsetX $offsetY $color")

inline fun BoxShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): BoxShadow =
    unsafeCast("$offsetX $offsetY $blurRadius $color")

inline fun BoxShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    spreadRadius: Length,
    color: Color,
): BoxShadow =
    unsafeCast("$offsetX $offsetY $blurRadius $spreadRadius $color")

inline fun BoxShadow(
    inset: BoxShadowInset,
    offsetX: Length,
    offsetY: Length,
    color: Color,
): BoxShadow =
    unsafeCast("$inset $offsetX $offsetY $color")

inline fun BoxShadow(
    inset: BoxShadowInset,
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): BoxShadow =
    unsafeCast("$inset $offsetX $offsetY $blurRadius $color")

inline fun BoxShadow(
    inset: BoxShadowInset,
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    spreadRadius: Length,
    color: Color,
): BoxShadow =
    unsafeCast("$inset $offsetX $offsetY $blurRadius $spreadRadius $color")
