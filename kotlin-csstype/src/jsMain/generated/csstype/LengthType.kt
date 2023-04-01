// Automatically generated - do not modify!

package csstype

sealed external interface LengthType :
    AutoLength,
    Bleed,
    GeometryPosition,
    GridLength,
    LengthProperty,
    LineWidth,
    ShapeRadius {

    sealed interface Auto :
        AutoLength,
        BlockSize,
        BorderImageWidth,
        Columns,
        GridAutoTracks,
        GridTemplateTracks,
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
        GridAutoTracks,
        GridTemplateTracks,
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
        GridAutoTracks,
        GridTemplateTracks,
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
        ContainIntrinsicBlockSize,
        ContainIntrinsicHeight,
        ContainIntrinsicInlineSize,
        ContainIntrinsicSize,
        ContainIntrinsicWidth,
        GridTemplateTracks,
        MaxBlockSize,
        MaxHeight,
        MaxInlineSize,
        MaxWidth

    sealed interface Normal :
        LineHeight
}
