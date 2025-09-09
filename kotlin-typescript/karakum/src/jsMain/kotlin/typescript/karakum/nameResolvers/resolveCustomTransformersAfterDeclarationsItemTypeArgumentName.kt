package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveCustomTransformersAfterDeclarationsItemTypeArgumentName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val typeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "TransformerFactory")

    val union = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isUnionTypeNode(union))

    val arrayType = ensureNotNull(
        typeScriptService.getParent(union)
            ?.let {
                if (isParenthesizedTypeNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isArrayTypeNode(arrayType))

    val property = ensureNotNull(
        typeScriptService.getParent(arrayType)
            ?.let {
                if (isTypeOperatorNode(it)) {
                    typeScriptService.getParent(it)
                } else it
            }
    )
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    ensure(propertyNameNode.text == "afterDeclarations")

    val interfaceNode = ensureNotNull(typeScriptService.getParent(property))
    ensure(isInterfaceDeclaration(interfaceNode))
    ensure(interfaceNode.name.text == "CustomTransformers")

    "CustomTransformersAfterDeclarationsItemTypeArgument"
}
