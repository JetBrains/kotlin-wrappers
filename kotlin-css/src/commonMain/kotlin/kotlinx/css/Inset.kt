package kotlinx.css

data class Inset(
    val top: LinearDimension,
    val right: LinearDimension,
    val bottom: LinearDimension,
    val left: LinearDimension
) : CssValue(
    getShorthandValue(top, right, bottom, left)
) {
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

var StyledElement.inset: Inset
    get() = error("Write-only property")
    set(value) {
        put("inset", value.value)
    }
