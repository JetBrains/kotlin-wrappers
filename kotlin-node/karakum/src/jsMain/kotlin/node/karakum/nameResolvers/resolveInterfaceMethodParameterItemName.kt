package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import arrow.core.raise.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isTypeReferenceNode

fun resolveInterfaceMethodParameterItemName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val typeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "Array")

    val parameter = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isParameter(parameter))

    val parameterNameNode = parameter.name
    ensure(isIdentifier(parameterNameNode))
    val parameterName = parameterNameNode.text

    val method = ensureNotNull(typeScriptService.getParent(parameter))
    ensure(isMethodSignature(method))

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = ensureNotNull(interfaceNode.name).text.let {
        when (it) {
            "DuplexOptions" -> "WritableOptions"
            "TransformOptions" -> "WritableOptions"
            else -> it
        }
    }

    "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}Item"
}
