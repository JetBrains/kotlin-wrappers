package testing.library.react.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isIntersectionTypeNode
import typescript.isMappedTypeNode
import typescript.isTypeAliasDeclaration

fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isMappedTypeNode(node))

        val intersection = ensureNotNull(node.getParentOrNull())
        ensure(isIntersectionTypeNode(intersection))

        val typeAlias = ensureNotNull(intersection.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "RenderResult")

        "override"
    }
}
