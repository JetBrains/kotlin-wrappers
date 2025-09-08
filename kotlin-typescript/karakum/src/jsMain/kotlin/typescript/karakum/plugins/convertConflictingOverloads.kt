package typescript.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.MethodSignature
import typescript.asArray
import typescript.isCallSignatureDeclaration
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isUnionTypeNode

private fun isConflictingOverload(node: MethodSignature) = nullable {
    val name = node.name
    ensure(isIdentifier(name))
    ensure(name.text == "applyCodeActionCommand")

    ensureNotNull(
        nullable {
            val firstParameter = ensureNotNull(node.parameters.asArray().firstOrNull())

            val firstParameterType = ensureNotNull(firstParameter.type)
            ensure(isUnionTypeNode(firstParameterType))
        } ?: nullable {
            val secondParameter = ensureNotNull(node.parameters.asArray().getOrNull(1))

            val secondParameterType = ensureNotNull(secondParameter.type)
            ensure(isUnionTypeNode(secondParameterType))
        }
    )
} != null

val convertConflictingOverloads = createPlugin { node, _, _ ->
    nullable {
        ensure(isMethodSignature(node))
        ensure(isConflictingOverload(node))

        ""
    } ?: nullable {
        ensure(isCallSignatureDeclaration(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "NodesVisitor")

        ensure(node.typeParameters?.asArray()?.size == 3)

        ""
    } ?: nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "visitNodes")

        ensure(node.typeParameters?.asArray()?.size == 3)

        ""
    }
}
