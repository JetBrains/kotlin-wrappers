package kotlinx.css

class Border(width: LinearDimension, style: BorderStyle, color: Color = Color.currentColor) : CssValue("$width $style $color") {
    companion object {
        val none = Border(0.px, BorderStyle.none, Color.transparent)
    }
}

var StyledElement.border: Border
    set(value) = put("border", value.value)
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderTop: Border
    set(value) = put("borderTop", value.value)
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderRight: Border
    set(value) = put("borderRight", value.value)
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderBottom: Border
    set(value) = put("borderBottom", value.value)
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

var StyledElement.borderLeft: Border
    set(value) = put("borderLeft", value.value)
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
