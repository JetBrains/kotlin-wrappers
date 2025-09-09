package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isPropertySignature
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode
import typescript.isUnionTypeNode

fun resolveTypeAliasNullableUnionPropertyName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    val property = ensureNotNull(typeScriptService.getParent(node))
    ensure(isPropertySignature(property))

    val propertyNameNode = property.name
    ensure(isIdentifier(propertyNameNode))
    val propertyName = propertyNameNode.text

    val typeLiteral = ensureNotNull(typeScriptService.getParent(property))
    ensure(isTypeLiteralNode(typeLiteral))

    val union = ensureNotNull(typeScriptService.getParent(typeLiteral))
    ensure(isUnionTypeNode(union))
    ensure(union.types.asArray().size > 1)

    val unionSecondType = union.types.asArray()[1]
    ensure(unionSecondType.kind == SyntaxKind.UndefinedKeyword)

    val typeAlias = ensureNotNull(typeScriptService.getParent(union))
    ensure(isTypeAliasDeclaration(typeAlias))
    val parentName = typeAlias.name.text

    "Required${parentName.replaceFirstChar { it.titlecase() }}${propertyName.replaceFirstChar { it.titlecase() }}"
}
