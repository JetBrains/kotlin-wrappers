package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import arrow.core.raise.nullable
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature
import typescript.isTypeLiteralNode

fun resolveInterfacePropertyPropertyName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val subProperty = ensureNotNull(typeScriptService.getParent(node))
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

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}${subPropertyName.replaceFirstChar { it.titlecase() }}"
}
