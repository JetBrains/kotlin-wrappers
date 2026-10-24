package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isInterfaceDeclaration

val convertStreamOptionsTypeParameter = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFile()).fileName
        ensure(sourceFileName.endsWith("stream.d.ts"))

        ensure(isIdentifier(node))
        ensure(
            node.text == "Readable"
                    || node.text == "Writable"
        )

        val expressionWithTypeArguments = node
            .parent // TypeReference
            ?.parent // ExpressionWithTypeArguments
            .let { ensureNotNull(it) }
        ensure(isExpressionWithTypeArguments(expressionWithTypeArguments))

        val expression = expressionWithTypeArguments.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "StreamOptions")

        val interfaceNode = expressionWithTypeArguments
            .parent // HeritageClause
            ?.parent // InterfaceDeclaration
            .let { ensureNotNull(it) }
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(
            interfaceNode.name.text == "ReadableOptions"
                    || interfaceNode.name.text == "WritableOptions"
        )

        "Stream /* ${render(node)} */"
    }
}
