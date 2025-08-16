package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isMethodDeclaration
import typescript.isParameter
import typescript.isTypeReferenceNode

fun resolveClassMethodParameterItemName(node: Node, context: Context) = nullable {
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
    ensure(isMethodDeclaration(method))

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    var methodName = methodNameNode.text
    if (methodName == "_writev") {
        methodName = "writev"
    }

    val classNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isClassDeclaration(classNode))
    var parentName = ensureNotNull(classNode.name).text
    if (
        parentName === "Writable"
        || parentName === "Duplex"
    ) {
        parentName = "Writable"
    }

    "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}${parameterName.replaceFirstChar { it.titlecase() }}Item"
}
