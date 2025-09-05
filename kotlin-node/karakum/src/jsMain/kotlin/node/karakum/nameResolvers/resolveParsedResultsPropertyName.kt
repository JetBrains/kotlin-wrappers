package node.karakum.nameResolvers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import arrow.core.raise.nullable
import typescript.Node
import typescript.isConditionalTypeNode
import typescript.isIdentifier
import typescript.isPropertySignature
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode

fun resolveParsedResultsPropertyName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val property = ensureNotNull(typeScriptService.getParent(node))
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val typeLiteral = ensureNotNull(typeScriptService.getParent(property))
    ensure(isTypeLiteralNode(typeLiteral))

    val conditionalType = ensureNotNull(typeScriptService.getParent(typeLiteral))
    ensure(isConditionalTypeNode(conditionalType))

    val typeAlias = ensureNotNull(typeScriptService.getParent(conditionalType))
    ensure(isTypeAliasDeclaration(typeAlias))
    val parentName = typeAlias.name.text
    ensure(parentName == "ParsedResults")

    "${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}"
}
