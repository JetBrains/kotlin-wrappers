package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isTypeReferenceNode

fun resolveInterfaceMethodReturnTypePromisePayloadName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val typeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "Promise")

    val method = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isMethodSignature(method))
    ensure(method.type === typeReference)

    val methodNameNode = method.name
    ensure(isIdentifier(methodNameNode))
    val methodName = methodNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(method))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    nullable {
        ensure(methodName == "write")
        ensure(parentName == "FileHandle")

        val firstParameter = ensureNotNull(method.parameters.asArray().firstOrNull())

        val firstParameterType = ensureNotNull(firstParameter.type)
        ensure(firstParameterType.kind == SyntaxKind.StringKeyword)

        "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}StringResultPayload"
    } ?: nullable {
        "${parentName.replaceFirstChar { it.titlecase() }}${methodName.replaceFirstChar { it.titlecase() }}ResultPayload"
    }
}
