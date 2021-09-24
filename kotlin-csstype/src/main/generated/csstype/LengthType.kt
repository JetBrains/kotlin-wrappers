// Automatically generated - do not modify!

package csstype

sealed external interface LengthType :
    GridLength,
    LengthProperty {

    sealed interface Auto :
        AutoLengthProperty,
        BlockSize,
        BorderImageWidth,
        Columns,
        GridAutoColumns,
        GridAutoRows,
        GridTemplateColumns,
        GridTemplateRows,
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

    sealed interface Intrinsic :
        MaxHeight,
        MaxWidth,
        MinHeight,
        MinWidth,
        Width

    sealed interface MaxContent :
        BlockSize,
        GridAutoColumns,
        GridAutoRows,
        GridTemplateColumns,
        GridTemplateRows,
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
        GridAutoColumns,
        GridAutoRows,
        GridTemplateColumns,
        GridTemplateRows,
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

    sealed interface MinIntrinsic :
        MinWidth,
        Width

    sealed interface None :
        GridTemplateColumns,
        GridTemplateRows,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth

    sealed interface Normal :
        LineHeight
}
