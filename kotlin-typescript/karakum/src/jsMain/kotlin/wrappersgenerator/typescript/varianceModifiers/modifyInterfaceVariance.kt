package wrappersgenerator.typescript.varianceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isInterfaceDeclaration
import typescript.ast.`is`.isTypeParameterDeclaration

suspend fun modifyInterfaceVariance(node: Node, context: Context) = nullable {
    ensure(isTypeParameterDeclaration(node))

    nullable {
        ensure(node.name.text == "TKind")

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Token")

        "out"
    }
}
