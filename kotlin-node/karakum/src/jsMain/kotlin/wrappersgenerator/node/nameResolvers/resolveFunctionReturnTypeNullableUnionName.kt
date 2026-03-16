package wrappersgenerator.node.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveFunctionReturnTypeNullableUnionName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val union = ensureNotNull(typeScriptService.getParent(node))
    ensure(isUnionTypeNode(union))
    ensure(union.types.asArray().size > 1)

    val unionSecondType = ensureNotNull(union.types.asArray().getOrNull(1))
    ensure(unionSecondType.kind == SyntaxKind.UndefinedKeyword)

    val function = ensureNotNull(typeScriptService.getParent(union))
    ensure(isFunctionDeclaration(function))
    ensure(function.type === union)
    val parentName = ensureNotNull(function.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}Result"
}
