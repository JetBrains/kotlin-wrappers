package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

val convertGetPeerCertificate = createPlugin { node, context, _ ->
    nullable {
        ensure(isMethodDeclaration(node))

        val methodName = node.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "getPeerCertificate")

        val classNode = ensureNotNull(node.getParentOrNull())
        ensure(isClassDeclaration(classNode))

        val className = ensureNotNull(classNode.name)
        ensure(className.text == "TLSSocket")

        ensure(node.parameters.asArray().size == 1)

        val firstParameterType = ensureNotNull(
            node.parameters.asArray().getOrNull(0)?.type
        )
        ensure(isLiteralTypeNode(firstParameterType))
        ensure(
            firstParameterType.literal.kind == SyntaxKind.TrueKeyword
                    || firstParameterType.literal.kind == SyntaxKind.FalseKeyword
        )

        ""
    }
}
