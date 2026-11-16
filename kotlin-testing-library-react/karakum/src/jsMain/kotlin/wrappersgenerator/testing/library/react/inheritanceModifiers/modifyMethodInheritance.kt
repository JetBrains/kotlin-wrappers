package wrappersgenerator.testing.library.react.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isIntersectionTypeNode
import typescript.ast.`is`.isMappedTypeNode
import typescript.ast.`is`.isTypeAliasDeclaration

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
