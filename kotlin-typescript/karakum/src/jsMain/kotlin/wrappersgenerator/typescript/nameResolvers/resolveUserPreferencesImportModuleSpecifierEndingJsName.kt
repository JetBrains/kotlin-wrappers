package wrappersgenerator.typescript.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isLiteralTypeNode
import typescript.ast.`is`.isStringLiteral
import typescript.ast.`is`.isUnionTypeNode

suspend fun resolveUserPreferencesImportModuleSpecifierEndingJsName(node: Node, context: Context) = nullable {
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
