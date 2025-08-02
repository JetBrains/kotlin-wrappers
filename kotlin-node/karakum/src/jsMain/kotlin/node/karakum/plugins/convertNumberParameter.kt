package node.karakum.plugins

import node.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.SyntaxKind
import typescript.isFunctionTypeNode
import typescript.isParameter

val convertNumberParameter = createPlugin { node, _, _ ->
    nullable {
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val callbackParameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(callbackParameter))

        val functionType = ensureNotNull(callbackParameter.getParentOrNull())
        ensure(isFunctionTypeNode(functionType))

        val parameter = ensureNotNull(functionType.getParentOrNull())
        ensure(isParameter(parameter))

        "Double"
    } ?: nullable {
        ensure(node.kind == SyntaxKind.NumberKeyword)

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        "Number"
    }
}
