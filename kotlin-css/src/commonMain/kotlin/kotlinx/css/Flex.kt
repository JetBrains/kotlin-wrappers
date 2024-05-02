package kotlinx.css

data class Flex(override val value: String) : CssValue(value) {
    override fun toString() = value

    constructor(flexGrow: Number) : this("$flexGrow")
    constructor(flexBasis: LinearDimension) : this("$flexBasis")
    constructor(flexGrow: Number, flexShrink: Number) : this("$flexGrow $flexShrink")
    constructor(flexGrow: Number, flexBasis: LinearDimension) : this("$flexGrow $flexBasis")
    constructor(flexGrow: Number, flexShrink: Number, flexBasis: FlexBasis) : this("$flexGrow $flexShrink $flexBasis")
    constructor(flexGrow: Number, flexShrink: Number, flexBasis: LinearDimension) : this("$flexGrow $flexShrink $flexBasis")

    companion object {
        val NONE = Flex(0, 0, LinearDimension.auto)
        val GROW = Flex(1, 0, LinearDimension.auto)
        val SHRINK = Flex(0, 1, LinearDimension.auto)
        val GROW_SHRINK = Flex(1, 1, LinearDimension.auto)
    }
}

@get:Deprecated("Write-only property", level = DeprecationLevel.HIDDEN) var StyledElement.flex: Flex by CssProperty()

