package wrappersgenerator.tanstack.virtual.core.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import typescript.Node

suspend fun resolveItemRangeName(node: Node, context: Context) = nullable {
    ensure(typeLiteralMemberNames(node) == setOf("startIndex", "endIndex"))

    "ItemRange"
}
