package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import arrow.core.raise.nullable
import typescript.Node
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isTypeReferenceNode

fun resolveFunctionReturnTypePromisePayloadName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val typeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "Promise")

    val function = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isFunctionDeclaration(function))
    ensure(function.type === typeReference)
    val parentName = ensureNotNull(function.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}ResultPayload"
}
