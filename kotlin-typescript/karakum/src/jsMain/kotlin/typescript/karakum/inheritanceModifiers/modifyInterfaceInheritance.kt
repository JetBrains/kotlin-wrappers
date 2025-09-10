package typescript.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import typescript.Node
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode

fun modifyInterfaceInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    ensure(
        isInterfaceDeclaration(node)
                || isTypeAliasDeclaration(node)
                || isTypeLiteralNode(node)
                || isIntersectionTypeNode(node)
    )

    "sealed"
}
