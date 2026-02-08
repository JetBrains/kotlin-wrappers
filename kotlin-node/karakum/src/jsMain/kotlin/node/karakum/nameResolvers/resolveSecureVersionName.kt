package node.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.*

fun resolveSecureVersionName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    ensure(isLiteralTypeNode(node))

    val literal = node.literal
    ensure(isStringLiteral(literal))
    ensure(literal.text.startsWith("TLSv1."))

    val unionType = ensureNotNull(typeScriptService.getParent(node))
    ensure(isUnionTypeNode(unionType))

    // TODO: compiler complains about the dot, looks like a bug
    "`${literal.text.replace(".", "-")}`"
}
