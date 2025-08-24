package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isIntersectionTypeNode
import typescript.isMethodSignature

fun resolveMockTrackerMethodReturnTypeName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val intersection = ensureNotNull(typeScriptService.getParent(node))
    ensure(isIntersectionTypeNode(intersection))

    val method = ensureNotNull(typeScriptService.getParent(intersection))
    ensure(isMethodSignature(method))
    ensure(method.type === intersection)

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = ensureNotNull(interfaceNode.name).text
    ensure(parentName == "MockTracker")

    "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}Result"
}
