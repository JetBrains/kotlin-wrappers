package testinglibrary.dom.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature

fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable {
            ensure(name.text == "toString")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "Suggestion")

            "override"
        }
    }
}
