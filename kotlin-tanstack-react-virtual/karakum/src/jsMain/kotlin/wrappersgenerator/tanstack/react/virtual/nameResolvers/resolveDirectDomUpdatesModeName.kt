package wrappersgenerator.tanstack.react.virtual.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isPropertySignature
import typescript.ast.`is`.isUnionTypeNode

suspend fun resolveDirectDomUpdatesModeName(node: Node, context: Context) = nullable {
    val typeScriptService = context.requireService(typeScriptServiceKey)

    ensure(isUnionTypeNode(node))

    val property = ensureNotNull(typeScriptService.getParent(node))
    ensure(isPropertySignature(property))

    val propertyName = property.name
    ensure(isIdentifier(propertyName))
    ensure(propertyName.text == "directDomUpdatesMode")

    "DirectDomUpdatesMode"
}
