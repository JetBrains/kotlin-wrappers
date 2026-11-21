// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface FilterFunction :
    Filter,
    BackdropFilter

inline fun blur(
    value: Int,
): FilterFunction =
    unsafeCast("blur($value)")

inline fun blur(
    value: Double,
): FilterFunction =
    unsafeCast("blur($value)")

inline fun blur(
    value: Length,
): FilterFunction =
    unsafeCast("blur($value)")

inline fun brightness(
    value: Int,
): FilterFunction =
    unsafeCast("brightness($value)")

inline fun brightness(
    value: Double,
): FilterFunction =
    unsafeCast("brightness($value)")

inline fun brightness(
    value: Percentage,
): FilterFunction =
    unsafeCast("brightness($value)")

inline fun contrast(
    value: Int,
): FilterFunction =
    unsafeCast("contrast($value)")

inline fun contrast(
    value: Double,
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
    value: Int,
): FilterFunction =
    unsafeCast("grayscale($value)")

inline fun grayscale(
    value: Double,
): FilterFunction =
    unsafeCast("grayscale($value)")

inline fun grayscale(
    value: Percentage,
): FilterFunction =
    unsafeCast("grayscale($value)")

inline fun hueRotate(
    value: Int,
): FilterFunction =
    unsafeCast("hue-rotate($value)")

inline fun hueRotate(
    value: Double,
): FilterFunction =
    unsafeCast("hue-rotate($value)")

inline fun hueRotate(
    value: Angle,
): FilterFunction =
    unsafeCast("hue-rotate($value)")

inline fun invert(
    value: Int,
): FilterFunction =
    unsafeCast("invert($value)")

inline fun invert(
    value: Double,
): FilterFunction =
    unsafeCast("invert($value)")

inline fun invert(
    value: Percentage,
): FilterFunction =
    unsafeCast("invert($value)")

inline fun opacity(
    value: Int,
): FilterFunction =
    unsafeCast("opacity($value)")

inline fun opacity(
    value: Double,
): FilterFunction =
    unsafeCast("opacity($value)")

inline fun opacity(
    value: Percentage,
): FilterFunction =
    unsafeCast("opacity($value)")

inline fun saturate(
    value: Int,
): FilterFunction =
    unsafeCast("saturate($value)")

inline fun saturate(
    value: Double,
): FilterFunction =
    unsafeCast("saturate($value)")

inline fun saturate(
    value: Percentage,
): FilterFunction =
    unsafeCast("saturate($value)")

inline fun sepia(
    value: Int,
): FilterFunction =
    unsafeCast("sepia($value)")

inline fun sepia(
    value: Double,
): FilterFunction =
    unsafeCast("sepia($value)")

inline fun sepia(
    value: Percentage,
): FilterFunction =
    unsafeCast("sepia($value)")
