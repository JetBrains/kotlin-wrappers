package wrappersgenerator.testing.library.dom.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isInterfaceDeclaration
import typescript.ast.`is`.isMethodSignature

suspend fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable {
            ensure(name.text == "toString")

            val interfaceNode = ensureNotNull(node.parent)
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "Suggestion")

            "override"
        }
    }
}
