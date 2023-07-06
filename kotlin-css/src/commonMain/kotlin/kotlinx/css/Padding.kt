package kotlinx.css

data class Padding(
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

var StyledElement.padding: Padding
    set(value) {
        val (top, right, bottom, left) = value
        if (top != null && right != null && bottom != null && left != null) {
            put("padding", getShorthandValue(top, right, bottom, left))
        } else {
            top?.let { this.paddingTop = it }
            right?.let { this.paddingRight = it }
            bottom?.let { this.paddingBottom = it }
            left?.let { this.paddingLeft = it }
        }
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
