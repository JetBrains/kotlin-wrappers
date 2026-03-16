package wrappersgenerator.typescript.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isLiteralTypeNode
import typescript.isStringLiteral
import typescript.isUnionTypeNode

fun resolveUserPreferencesImportModuleSpecifierEndingJsName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    ensure(isLiteralTypeNode(node))

    val literal = node.literal
    ensure(isStringLiteral(literal))
    ensure(literal.text == "js")

    val unionType = ensureNotNull(typeScriptService.getParent(node))
    ensure(isUnionTypeNode(unionType))

    // conflicts with package
    "JS"
}
