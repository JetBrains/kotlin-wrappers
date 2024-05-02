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

@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.inset: Inset by CssProperty()
