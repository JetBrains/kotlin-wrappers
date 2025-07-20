package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.SyntaxKind
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isPropertyDeclaration
import typescript.isUnionTypeNode

private val numberProps = mapOf(
    // http
    "IncomingMessage" to mapOf(
        "statusCode" to "Int",
    ),
)

private val numberParams = mapOf(
    // process
    "Process" to mapOf(
        "exit" to mapOf(
            "code" to "Int",
        ),
    ),
)

val convertNumbers = createPlugin { node, _, _ ->
    nullable {
        // union property
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val union = ensureNotNull(node.getParentOrNull())
        ensure(isUnionTypeNode(union))

        val property = ensureNotNull(union.getParentOrNull())
        ensure(isPropertyDeclaration(property))

        val classNode = ensureNotNull(property.getParentOrNull())
        ensure(isClassDeclaration(classNode))

        val className = ensureNotNull(classNode.name)
        val classNumberTypes = ensureNotNull(numberProps[className.text])

        val propertyName = property.name
        ensure(isIdentifier(propertyName))

        classNumberTypes[propertyName.text]
    } ?: nullable {
        // union parameter
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val union = ensureNotNull(node.getParentOrNull())
        ensure(isUnionTypeNode(union))

        val parameter = ensureNotNull(union.getParentOrNull())
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodSignature(method))

        val interfaceNode = ensureNotNull(method.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))

        val interfaceName = ensureNotNull(interfaceNode.name)
        ensure(isIdentifier(interfaceName))
        val interfaceNumberTypes = ensureNotNull(numberParams[interfaceName.text])

        val methodName = method.name
        ensure(isIdentifier(methodName))
        val methodNumberTypes = ensureNotNull(interfaceNumberTypes[methodName.text])

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))

        methodNumberTypes[parameterName.text]
    }
}
