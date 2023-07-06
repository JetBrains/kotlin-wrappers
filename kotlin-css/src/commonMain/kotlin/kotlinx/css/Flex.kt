package kotlinx.css

fun StyledElement.flex(flexGrow: Number) {
    put("flex", "$flexGrow")
}

fun StyledElement.flex(flexBasis: LinearDimension) {
    put("flex", "$flexBasis")
}

fun StyledElement.flex(flexGrow: Number, flexShrink: Number) {
    put("flex", "$flexGrow $flexShrink")
}

fun StyledElement.flex(flexGrow: Number, flexBasis: LinearDimension) {
    put("flex", "$flexGrow $flexBasis")
}

// The default values that are commented out used to be set before pre.362
fun StyledElement.flex(flexGrow: Number/* = 0.0 */, flexShrink: Number/* = 1.0 */, flexBasis: FlexBasis/* = FlexBasis.auto */) {
    put("flex", "$flexGrow $flexShrink $flexBasis")
}

// The default values that are commented out used to be set before pre.362
fun StyledElement.flex(flexGrow: Number/* = 0.0 */, flexShrink: Number/* = 1.0 */, flexBasis: LinearDimension) =
    flex(flexGrow, flexShrink, flexBasis.basis)

fun StyledElement.flex(flex: Flex) {
    when (flex) {
        Flex.NONE -> flex(0, 0, LinearDimension.auto)
        Flex.GROW -> flex(1, 0, LinearDimension.auto)
        Flex.SHRINK -> flex(0, 1, LinearDimension.auto)
        Flex.GROW_SHRINK -> flex(1, 1, LinearDimension.auto)
    }
}

enum class Flex {
    NONE, GROW, SHRINK, GROW_SHRINK
}
