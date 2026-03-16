package wrappersgenerator.testing.library.user.event.nameResolvers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import typescript.Node
import typescript.isIdentifier
import typescript.isTypeLiteralNode
import typescript.isVariableDeclaration

fun resolveMouseButtonTypeName(node: Node, context: Context) = nullable {
    val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))

    ensure(isTypeLiteralNode(node))

    val variable = ensureNotNull(typeScriptService.getParent(node))
    ensure(isVariableDeclaration(variable))

    val variableName = variable.name
    ensure(isIdentifier(variableName))
    ensure(variableName.text == "MouseButton")

    "MouseButtonType"
}
