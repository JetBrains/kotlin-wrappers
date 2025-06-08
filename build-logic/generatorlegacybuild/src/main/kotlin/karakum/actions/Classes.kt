package karakum.actions

import karakum.common.ConversionResult

internal fun List<ConversionResult>.removeDuplicatedInterfaces(): List<ConversionResult> {
    val classNames = this
        .filter { "external class " in it.body }
        .map { it.name }

    val redundantInterfaces = filter { (it.name in classNames) && ("external interface " in it.body) }
    return this - redundantInterfaces
}
