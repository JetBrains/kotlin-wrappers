package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.SyntaxKind
import typescript.ast.`is`.isFunctionTypeNode
import typescript.ast.`is`.isParameter

val convertNumberParameter = createPlugin { node, _, _ ->
    nullable {
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val callbackParameter = ensureNotNull(node.parent)
        ensure(isParameter(callbackParameter))

        val functionType = ensureNotNull(callbackParameter.parent)
        ensure(isFunctionTypeNode(functionType))

        val parameter = ensureNotNull(functionType.parent)
        ensure(isParameter(parameter))

        "Double"
    } ?: nullable {
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val parameter = ensureNotNull(node.parent)
        ensure(isParameter(parameter))

        "Number"
    }
}
