package typescript.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.TypeScriptService
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isFunctionDeclaration
import typescript.isTypePredicateNode

fun resolveFunctionReturnTypePredicateName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    val typePredicate = ensureNotNull(typeScriptService.getParent(node))
    ensure(isTypePredicateNode(typePredicate))

    val function = ensureNotNull(typeScriptService.getParent(typePredicate))
    ensure(isFunctionDeclaration(function))
    ensure(function.type === typePredicate)
    val parentName = ensureNotNull(function.name).text

    "${parentName.replaceFirstChar { it.titlecase() }}ResultPredicate"
}
