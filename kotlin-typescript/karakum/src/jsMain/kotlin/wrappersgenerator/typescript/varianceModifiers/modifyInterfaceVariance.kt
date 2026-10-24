package wrappersgenerator.typescript.varianceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import typescript.Node
import typescript.isInterfaceDeclaration
import typescript.isTypeParameterDeclaration

suspend fun modifyInterfaceVariance(node: Node, context: Context) = nullable {
    ensure(isTypeParameterDeclaration(node))

    nullable {
        ensure(node.name.text == "TKind")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Token")

        "out"
    } ?: nullable {
        ensure(node.name.text == "T")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "NodeArray")

        "out"
    }
}
