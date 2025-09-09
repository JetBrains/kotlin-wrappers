package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isIdentifier
import typescript.isPropertySignature
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode
import typescript.isTypeReferenceNode

fun resolveChangePropertyTypesPropertyName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val property = ensureNotNull(typeScriptService.getParent(node))
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val typeLiteral = ensureNotNull(typeScriptService.getParent(property))
    ensure(isTypeLiteralNode(typeLiteral))

    val typeReference = ensureNotNull(typeScriptService.getParent(typeLiteral))
    ensure(isTypeReferenceNode(typeReference))

    val typeName = typeReference.typeName
    ensure(isIdentifier(typeName))
    ensure(typeName.text == "ChangePropertyTypes")

    val typeAlias = ensureNotNull(typeScriptService.getParent(typeReference))
    ensure(isTypeAliasDeclaration(typeAlias))
    val parentName = typeAlias.name.text

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}"
}
