package karakum.csstype

import karakum.common.sealedUnionBody

internal const val BOX_SHADOW = "BoxShadow"
internal const val BOX_SHADOW_INSET = "BoxShadowInset"

private val INSET_PARAMETER = "inset" to BOX_SHADOW_INSET
private val COLOR_PARAMETER = "color" to COLOR

private val PARAMETERS = setOf(
    "offsetX",
    "offsetY",
    "blurRadius",
    "spreadRadius",
)

internal fun boxShadowFactories(): String {
    val factories = (2..4)
        .map { PARAMETERS.take(it) }
        .map { it.map { it to LENGTH } }
        .map { it + COLOR_PARAMETER }
        .let { it + it.map { listOf(INSET_PARAMETER) + it } }
        .map { factory(BOX_SHADOW, it.toTypedArray()) }

    return sequenceOf(sealedUnionBody(BOX_SHADOW_INSET, listOf("inset")))
        .plus(factories)
        .joinToString("\n\n")
}
