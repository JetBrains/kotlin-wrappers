// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.cssom

import js.reflect.unsafeCast

sealed external interface FilterFunction :
    Filter,
    BackdropFilter

inline fun blur(
    value: Number,
): FilterFunction =
    unsafeCast("blur($value)")

inline fun blur(
    value: Length,
): FilterFunction =
    unsafeCast("blur($value)")

inline fun brightness(
    value: Number,
): FilterFunction =
    unsafeCast("brightness($value)")

inline fun brightness(
    value: Percentage,
): FilterFunction =
    unsafeCast("brightness($value)")

inline fun contrast(
    value: Number,
): FilterFunction =
    unsafeCast("contrast($value)")

inline fun contrast(
    value: Percentage,
): FilterFunction =
    unsafeCast("contrast($value)")

inline fun dropShadow(
    offsetX: Length,
    offsetY: Length,
): FilterFunction =
    unsafeCast("drop-shadow($offsetX $offsetY)")

inline fun dropShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
): FilterFunction =
    unsafeCast("drop-shadow($offsetX $offsetY $blurRadius)")

inline fun dropShadow(
    offsetX: Length,
    offsetY: Length,
    blurRadius: Length,
    color: Color,
): FilterFunction =
    unsafeCast("drop-shadow($offsetX $offsetY $blurRadius $color)")

inline fun grayscale(
    value: Number,
): FilterFunction =
    unsafeCast("grayscale($value)")

inline fun grayscale(
    value: Percentage,
): FilterFunction =
    unsafeCast("grayscale($value)")

inline fun hueRotate(
    value: Number,
): FilterFunction =
    unsafeCast("hue-rotate($value)")

inline fun hueRotate(
    value: Angle,
): FilterFunction =
    unsafeCast("hue-rotate($value)")

inline fun invert(
    value: Number,
): FilterFunction =
    unsafeCast("invert($value)")

inline fun invert(
    value: Percentage,
): FilterFunction =
    unsafeCast("invert($value)")

inline fun opacity(
    value: Number,
): FilterFunction =
    unsafeCast("opacity($value)")

inline fun opacity(
    value: Percentage,
): FilterFunction =
    unsafeCast("opacity($value)")

inline fun saturate(
    value: Number,
): FilterFunction =
    unsafeCast("saturate($value)")

inline fun saturate(
    value: Percentage,
): FilterFunction =
    unsafeCast("saturate($value)")

inline fun sepia(
    value: Number,
): FilterFunction =
    unsafeCast("sepia($value)")

inline fun sepia(
    value: Percentage,
): FilterFunction =
    unsafeCast("sepia($value)")
