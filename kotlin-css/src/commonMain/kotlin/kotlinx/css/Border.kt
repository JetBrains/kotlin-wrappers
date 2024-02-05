package kotlinx.css

class Border(width: LinearDimension, style: BorderStyle, color: Color = Color.currentColor) : CssValue("$width $style $color") {
    companion object {
        val none = Border(0.px, BorderStyle.none, Color.transparent)
    }
}

var StyledElement.border: Border
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) = put("border", value.value)

var StyledElement.borderTop: Border
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) = put("borderTop", value.value)

var StyledElement.borderRight: Border
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) = put("borderRight", value.value)

var StyledElement.borderBottom: Border
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) = put("borderBottom", value.value)

var StyledElement.borderLeft: Border
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")
    set(value) = put("borderLeft", value.value)
