package wrappersgenerator.tanstack.react.virtual.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import typescript.ast.Node

suspend fun resolveScrollOptionsName(node: Node, context: Context) = nullable {
    ensure(typeLiteralMemberNames(node) == setOf("adjustments", "behavior"))

    "ScrollOptions"
}
