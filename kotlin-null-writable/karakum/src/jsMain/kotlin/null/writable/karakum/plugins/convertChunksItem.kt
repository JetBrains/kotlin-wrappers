package `null`.writable.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration
import typescript.isParameter
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode

val convertChunksItem = createPlugin { node, _, _ ->
    nullable {
        ensure(isTypeLiteralNode(node))

        val typeReference = ensureNotNull(node.getParentOrNull())
        ensure(isTypeReferenceNode(typeReference))

        val typeName = typeReference.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Array")

        val parameter = ensureNotNull(typeReference.getParentOrNull())
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "_chunks")

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodDeclaration(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))
        ensure(methodName.text == "_writev")

        val classNode = ensureNotNull(method.getParentOrNull())
        ensure(isClassDeclaration(classNode))
        ensure(classNode.name?.text == "NullWritable")

        "node.stream.WritableWritevChunksItem"
    }
}
