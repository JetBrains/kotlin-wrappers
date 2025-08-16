package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode

fun resolveInterfacePropertyPropertyItemPropertyItemName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val subTypeReference = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypeReferenceNode(subTypeReference))

    val subTypeName = subTypeReference.typeName
    ensure(isIdentifier(subTypeName))
    ensure(subTypeName.text == "Array")

    val subSubProperty = ensureNotNull(typeScriptService.getParent(subTypeReference))
    ensure(isPropertySignature(subSubProperty))

    val subSubPropertyNameNode = subSubProperty.name
    ensure(isIdentifier(subSubPropertyNameNode))
    val subSubPropertyName = subSubPropertyNameNode.text

    val subTypeLiteral = ensureNotNull(typeScriptService.getParent(subSubProperty))
    ensure(isTypeLiteralNode(subTypeLiteral))

    val typeReference = ensureNotNull(typeScriptService.getParent(subTypeLiteral))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "Array")

    val subProperty = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isPropertySignature(subProperty))

    val subPropertyNameNode = subProperty.name
    ensure(isIdentifier(subPropertyNameNode))
    val subPropertyName = subPropertyNameNode.text

    val typeLiteral = ensureNotNull(typeScriptService.getParent(subProperty))
    ensure(isTypeLiteralNode(typeLiteral))

    val property = ensureNotNull(typeScriptService.getParent(typeLiteral))
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val interfaceNode = ensureNotNull(typeScriptService.getParent(property))
    ensure(isInterfaceDeclaration(interfaceNode))
    val parentName = interfaceNode.name.text

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}${subPropertyName.replaceFirstChar { it.titlecase() }}Item${subSubPropertyName.replaceFirstChar { it.titlecase() }}Item"
}
