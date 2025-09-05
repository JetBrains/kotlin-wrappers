package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isInterfaceDeclaration

val convertStreamOptionsTypeParameter = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("stream.d.ts"))

        ensure(isIdentifier(node))
        ensure(
            node.text == "Readable"
                    || node.text == "Writable"
        )

        val expressionWithTypeArguments = node
            .getParentOrNull() // TypeReference
            ?.getParentOrNull() // ExpressionWithTypeArguments
            .let { ensureNotNull(it) }
        ensure(isExpressionWithTypeArguments(expressionWithTypeArguments))

        val expression = expressionWithTypeArguments.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "StreamOptions")

        val interfaceNode = expressionWithTypeArguments
            .getParentOrNull() // HeritageClause
            ?.getParentOrNull() // InterfaceDeclaration
            .let { ensureNotNull(it) }
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(
            interfaceNode.name.text == "ReadableOptions"
                    || interfaceNode.name.text == "WritableOptions"
        )

        "Stream /* ${render(node)} */"
    }
}
