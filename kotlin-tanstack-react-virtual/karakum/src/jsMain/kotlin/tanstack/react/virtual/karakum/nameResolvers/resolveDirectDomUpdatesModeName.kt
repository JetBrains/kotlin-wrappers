package tanstack.react.virtual.karakum.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isIdentifier
import typescript.isPropertySignature
import typescript.isUnionTypeNode

suspend fun resolveDirectDomUpdatesModeName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    ensure(isUnionTypeNode(node))

    val property = ensureNotNull(typeScriptService.getParent(node))
    ensure(isPropertySignature(property))

    val propertyName = property.name
    ensure(isIdentifier(propertyName))
    ensure(propertyName.text == "directDomUpdatesMode")

    "DirectDomUpdatesMode"
}
