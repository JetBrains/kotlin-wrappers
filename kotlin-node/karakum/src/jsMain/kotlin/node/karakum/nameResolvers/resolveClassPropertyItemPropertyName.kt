package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import node.karakum.util.nullable
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isPropertyDeclaration
import typescript.isPropertySignature
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode

fun resolveClassPropertyItemPropertyName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val subProperty = ensureNotNull(typeScriptService.getParent(node))
    ensure(isPropertySignature(subProperty))

    val subPropertyNameNode = subProperty.name
    ensure(isIdentifier(subPropertyNameNode))
    val subPropertyName = subPropertyNameNode.text

    val typeLiteral = ensureNotNull(typeScriptService.getParent(subProperty))
    ensure(isTypeLiteralNode(typeLiteral))

    val typeReference = ensureNotNull(typeScriptService.getParent(typeLiteral))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(
        typeName.text == "Array"
                || typeName.text == "ReadonlyArray"
    )

    val property = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isPropertyDeclaration(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val classNode = ensureNotNull(typeScriptService.getParent(property))
    ensure(isClassDeclaration(classNode))
    val parentName = ensureNotNull(classNode.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}Item${subPropertyName.replaceFirstChar { it.titlecase() }}"
}
