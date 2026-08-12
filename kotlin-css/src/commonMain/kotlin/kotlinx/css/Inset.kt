package kotlinx.css

data class Inset(
    val top: LinearDimension,
    val right: LinearDimension,
    val bottom: LinearDimension,
    val left: LinearDimension,
) : CssValue(
    getShorthandValue(top, right, bottom, left)
) {
    override fun toString() = value

    constructor(all: LinearDimension) : this(all, all, all, all)
    constructor(vertical: LinearDimension, horizontal: LinearDimension) : this(
        vertical,
        horizontal,
        vertical,
        horizontal
    )

    constructor(top: LinearDimension, horizontal: LinearDimension, bottom: LinearDimension) : this(
        top,
        horizontal,
        bottom,
        horizontal
    )
}

data class LinearInset(
    val start: LinearDimension,
    val end: LinearDimension,
) : CssValue(
    getShorthandValue(start, end)
) {
    override fun toString() = value

    constructor(all: LinearDimension) : this(all, all)
}

@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.inset: Inset by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.insetInline: LinearInset by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.insetBlock: LinearInset by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.insetInlineStart: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.insetInlineEnd: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.insetBlockStart: LinearDimension by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.insetBlockEnd: LinearDimension by CssProperty()
