package kotlinx.css

data class Margin(
    val top: LinearDimension? = null,
    val right: LinearDimension? = null,
    val bottom: LinearDimension? = null,
    val left: LinearDimension? = null
) {
    constructor(all: LinearDimension) : this(all, all, all, all)
    constructor(vertical: LinearDimension? = null, horizontal: LinearDimension? = null) : this(
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

var StyledElement.margin: Margin
    set(value) {
        val (top, right, bottom, left) = value
        if (top != null && right != null && bottom != null && left != null) {
            put("margin", getShorthandValue(top, right, bottom, left))
        } else {
            top?.let { this.marginTop = it }
            right?.let { this.marginRight = it }
            bottom?.let { this.marginBottom = it }
            left?.let { this.marginLeft = it }
        }
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
