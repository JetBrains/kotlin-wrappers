package karakum.cesium

import karakum.common.ConversionResult

internal abstract class Declaration : HasName {
    protected abstract val source: Definition

    abstract fun toCode(): String

    open fun toConversionResults(): Sequence<ConversionResult> =
        sequenceOf(
            ConversionResult(
                name = name,
                body = toCode(),
            )
        )
}
