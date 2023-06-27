package kotlinx.css.properties

import kotlinx.css.*

class Border(width: LinearDimension, style: BorderStyle, color: Color) : CssValue("$width $style $color") {
    companion object {
        val none = Border(0.px, BorderStyle.none, Color.transparent)
    }
}

var StyledElement.border: Border
    set(value) {
        declarations["border"] = value.value
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderTop: Border
    set(value) {
        declarations["border-top"] = value.value
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderRight: Border
    set(value) {
        declarations["border-right"] = value.value
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderBottom: Border
    set(value) {
        declarations["border-bottom"] = value.value
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderLeft: Border
    set(value) {
        declarations["border-left"] = value.value
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

fun StyledElement.border(
    width: LinearDimension,
    style: BorderStyle,
    color: Color,
    borderRadius: LinearDimension? = null
) {
    border = Border(width, style, color)
    borderRadius?.let {
        this.borderRadius = borderRadius
    }
}

@Deprecated("Use property borderTop = Border(width, style, color) instead", ReplaceWith("borderTop = Border(width, style, color)"))
fun StyledElement.borderTop(width: LinearDimension, style: BorderStyle, color: Color) {
    borderTop = Border(width, style, color)
}

@Deprecated("Use property borderRight = Border(width, style, color) instead", ReplaceWith("borderRight = Border(width, style, color)"))
fun StyledElement.borderRight(width: LinearDimension, style: BorderStyle, color: Color) {
    borderRight = Border(width, style, color)
}

@Deprecated("Use property borderBottom = Border(width, style, color) instead", ReplaceWith("borderBottom = Border(width, style, color)"))
fun StyledElement.borderBottom(width: LinearDimension, style: BorderStyle, color: Color) {
    borderBottom = Border(width, style, color)
}

@Deprecated("Use property borderLeft = Border(width, style, color) instead", ReplaceWith("borderLeft = Border(width, style, color)"))
fun StyledElement.borderLeft(width: LinearDimension, style: BorderStyle, color: Color) {
    borderLeft = Border(width, style, color)
}
