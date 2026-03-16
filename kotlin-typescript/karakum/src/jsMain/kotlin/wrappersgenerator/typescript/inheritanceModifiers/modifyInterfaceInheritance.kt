package wrappersgenerator.typescript.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import typescript.*

fun modifyInterfaceInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    ensure(
        isInterfaceDeclaration(node)
                || isTypeAliasDeclaration(node)
                || isTypeLiteralNode(node)
                || isIntersectionTypeNode(node)
    )

    "sealed"
}
