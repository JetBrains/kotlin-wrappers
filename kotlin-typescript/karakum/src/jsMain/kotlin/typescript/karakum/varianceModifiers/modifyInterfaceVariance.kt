package typescript.karakum.varianceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isInterfaceDeclaration
import typescript.isTypeParameterDeclaration

fun modifyInterfaceVariance(node: Node, context: Context) = nullable {
    ensure(isTypeParameterDeclaration(node))

    nullable {
        ensure(node.name.text == "TKind")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Token")

        "out"
    } ?: nullable {
        ensure(node.name.text == "T")

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "NodeArray")

        "out"
    }
}
