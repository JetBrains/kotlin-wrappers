package kotlinx.css

data class Border(val width: LinearDimension, val style: BorderStyle, val color: Color = Color.currentColor) : CssValue("$width $style $color") {
    override fun toString() = value

    companion object {
        val none = Border(0.px, BorderStyle.none, Color.transparent)
    }
}

@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.border: Border by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderTop: Border by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderRight: Border by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderBottom: Border by CssProperty()
@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.borderLeft: Border by CssProperty()
