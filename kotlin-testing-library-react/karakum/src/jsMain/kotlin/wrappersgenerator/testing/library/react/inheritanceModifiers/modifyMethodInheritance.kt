package wrappersgenerator.testing.library.react.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import js.reflect.invoke
import typescript.Node
import typescript.isIntersectionTypeNode
import typescript.isMappedTypeNode
import typescript.isTypeAliasDeclaration

suspend fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isMappedTypeNode(node))

        val intersection = ensureNotNull(node.parent)
        ensure(isIntersectionTypeNode(intersection))

        val typeAlias = ensureNotNull(intersection.parent)
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "RenderResult")

        "override"
    }
}
