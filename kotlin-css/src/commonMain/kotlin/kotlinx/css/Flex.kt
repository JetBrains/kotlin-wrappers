@file:Suppress("DEPRECATION")

package kotlinx.css

data class FlexProperty(val value: String) {
    constructor(flexGrow: Number) : this("$flexGrow")
    constructor(flexBasis: LinearDimension) : this("$flexBasis")
    constructor(flexGrow: Number, flexShrink: Number) : this("$flexGrow $flexShrink")
    constructor(flexGrow: Number, flexBasis: LinearDimension) : this("$flexGrow $flexBasis")
    constructor(flexGrow: Number, flexShrink: Number, flexBasis: FlexBasis) : this("$flexGrow $flexShrink $flexBasis")
    constructor(flexGrow: Number, flexShrink: Number, flexBasis: LinearDimension) : this("$flexGrow $flexShrink $flexBasis")
}

var StyledElement.flexProperty: FlexProperty
    set(value) {
        put("flex", value.value)
    }
    @Deprecated("Write-only property", level = DeprecationLevel.HIDDEN)
    get() = error("")

@Deprecated("Use flexProperty instead")
fun StyledElement.flex(flexGrow: Number) {
    put("flex", "$flexGrow")
}

@Deprecated("Use flexProperty instead")
fun StyledElement.flex(flexBasis: LinearDimension) {
    put("flex", "$flexBasis")
}

@Deprecated("Use flexProperty instead")
fun StyledElement.flex(flexGrow: Number, flexShrink: Number) {
    put("flex", "$flexGrow $flexShrink")
}

@Deprecated("Use flexProperty instead")
fun StyledElement.flex(flexGrow: Number, flexBasis: LinearDimension) {
    put("flex", "$flexGrow $flexBasis")
}

// The default values that are commented out used to be set before pre.362
@Deprecated("Use flexProperty instead")
fun StyledElement.flex(flexGrow: Number/* = 0.0 */, flexShrink: Number/* = 1.0 */, flexBasis: FlexBasis/* = FlexBasis.auto */) {
    put("flex", "$flexGrow $flexShrink $flexBasis")
}

// The default values that are commented out used to be set before pre.362
@Deprecated("Use flexProperty instead")
fun StyledElement.flex(flexGrow: Number/* = 0.0 */, flexShrink: Number/* = 1.0 */, flexBasis: LinearDimension) =
    flex(flexGrow, flexShrink, flexBasis.basis)

@Deprecated("Use flexProperty instead")
fun StyledElement.flex(flex: Flex) {
    when (flex) {
        Flex.NONE -> flex(0, 0, LinearDimension.auto)
        Flex.GROW -> flex(1, 0, LinearDimension.auto)
        Flex.SHRINK -> flex(0, 1, LinearDimension.auto)
        Flex.GROW_SHRINK -> flex(1, 1, LinearDimension.auto)
    }
}

@Deprecated("Use flexProperty instead")
enum class Flex {
    NONE, GROW, SHRINK, GROW_SHRINK
}
