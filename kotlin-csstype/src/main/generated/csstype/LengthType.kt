// Automatically generated - do not modify!

package csstype

sealed external interface LengthType :
    LengthProperty {

    sealed interface Auto :
        BlockSize,
        BorderImageWidth,
        Columns,
        Height,
        InlineSize,
        MaskBorderWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface FitContent :
        BlockSize,
        Height,
        InlineSize,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface MaxContent :
        BlockSize,
        Height,
        InlineSize,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface MinContent :
        BlockSize,
        Height,
        InlineSize,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth,
        MinBlockSize,
        MinHeight,
        MinInlineSize,
        MinWidth,
        Width

    sealed interface Normal :
        LineHeight

    sealed interface None :
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth

    sealed interface Intrinsic :
        MaxHeight,
        MaxWidth,
        MinHeight,
        MinWidth,
        Width

    sealed interface MinIntrinsic :
        MinWidth,
        Width
}
