// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
    "NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface Font {
    companion object {
        @JsValue("caption")
        val caption: Font

        @JsValue("icon")
        val icon: Font

        @JsValue("menu")
        val menu: Font

        @JsValue("message-box")
        val messageBox: Font

        @JsValue("small-caption")
        val smallCaption: Font

        @JsValue("status-bar")
        val statusBar: Font
    }
}

inline fun Font(
    style: FontStyle,
    size: FontSize,
    family: FontFamily,
): Font =
    "$style $size $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$style $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    size: FontSize,
    family: FontFamily,
): Font =
    "$variant $size $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$variant $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    weight: FontWeight,
    size: FontSize,
    family: FontFamily,
): Font =
    "$weight $size $family".unsafeCast<Font>()

inline fun Font(
    weight: FontWeight,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$weight $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    stretch: FontStretch,
    size: FontSize,
    family: FontFamily,
): Font =
    "$stretch $size $family".unsafeCast<Font>()

inline fun Font(
    stretch: FontStretch,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$stretch $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    size: FontSize,
    family: FontFamily,
): Font =
    "$style $variant $size $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$style $variant $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    weight: FontWeight,
    size: FontSize,
    family: FontFamily,
): Font =
    "$style $weight $size $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    weight: FontWeight,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$style $weight $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    stretch: FontStretch,
    size: FontSize,
    family: FontFamily,
): Font =
    "$style $stretch $size $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    stretch: FontStretch,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$style $stretch $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    weight: FontWeight,
    size: FontSize,
    family: FontFamily,
): Font =
    "$variant $weight $size $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    weight: FontWeight,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$variant $weight $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    stretch: FontStretch,
    size: FontSize,
    family: FontFamily,
): Font =
    "$variant $stretch $size $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    stretch: FontStretch,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$variant $stretch $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    weight: FontWeight,
    stretch: FontStretch,
    size: FontSize,
    family: FontFamily,
): Font =
    "$weight $stretch $size $family".unsafeCast<Font>()

inline fun Font(
    weight: FontWeight,
    stretch: FontStretch,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$weight $stretch $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    weight: FontWeight,
    size: FontSize,
    family: FontFamily,
): Font =
    "$style $variant $weight $size $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    weight: FontWeight,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$style $variant $weight $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    stretch: FontStretch,
    size: FontSize,
    family: FontFamily,
): Font =
    "$style $variant $stretch $size $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    stretch: FontStretch,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$style $variant $stretch $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    weight: FontWeight,
    stretch: FontStretch,
    size: FontSize,
    family: FontFamily,
): Font =
    "$variant $weight $stretch $size $family".unsafeCast<Font>()

inline fun Font(
    variant: FontVariant,
    weight: FontWeight,
    stretch: FontStretch,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$variant $weight $stretch $size/$lineHeight $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    weight: FontWeight,
    stretch: FontStretch,
    size: FontSize,
    family: FontFamily,
): Font =
    "$style $variant $weight $stretch $size $family".unsafeCast<Font>()

inline fun Font(
    style: FontStyle,
    variant: FontVariant,
    weight: FontWeight,
    stretch: FontStretch,
    size: FontSize,
    lineHeight: LineHeight,
    family: FontFamily,
): Font =
    "$style $variant $weight $stretch $size/$lineHeight $family".unsafeCast<Font>()
