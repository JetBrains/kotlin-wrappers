package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.*

val convertGetPeerCertificate = createPlugin { node, context, _ ->
    nullable {
        ensure(isMethodDeclaration(node))

        val methodName = node.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "getPeerCertificate")

        val classNode = ensureNotNull(node.parent)
        ensure(isClassDeclaration(classNode))

        val className = ensureNotNull(classNode.name)
        ensure(className.text == "TLSSocket")

        ensure(node.parameters.size == 1)

        val firstParameterType = ensureNotNull(
            node.parameters.getOrNull(0)?.type
        )
        ensure(isLiteralTypeNode(firstParameterType))
        ensure(
            firstParameterType.literal.kind == SyntaxKind.TrueKeyword
                    || firstParameterType.literal.kind == SyntaxKind.FalseKeyword
        )

        ""
    }
}
