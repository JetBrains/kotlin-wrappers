package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.asArray
import typescript.isIntersectionTypeNode
import typescript.isParenthesizedTypeNode
import typescript.isTypeAliasDeclaration
import typescript.isTypeLiteralNode
import typescript.isUnionTypeNode

fun resolveTypeAliasIntersectionBaseName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService<TypeScriptService>(typeScriptServiceKey))

    ensure(isUnionTypeNode(node))

    val intersection = ensureNotNull(
        typeScriptService.getParent(node)?.let {
            if (isParenthesizedTypeNode(it)) {
                typeScriptService.getParent(it)
            } else it
        }
    )
    ensure(isIntersectionTypeNode(intersection))
    ensure(intersection.types.asArray().size == 2)

    val intersectionSecondType = intersection.types.asArray()[1]
    ensure(isTypeLiteralNode(intersectionSecondType))

    val typeAlias = ensureNotNull(typeScriptService.getParent(intersection))
    ensure(isTypeAliasDeclaration(typeAlias))
    ensure(typeAlias.name.text == "ElementWithComputedPropertyName")

    "ElementWithComputedPropertyNameBase"
}
