package node.karakum.annotations

import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import node.karakum.util.Raise
import node.karakum.util.nullable
import typescript.Node
import typescript.isClassDeclaration
import typescript.isExpressionWithTypeArguments
import typescript.isHeritageClause
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isPropertyAccessExpression

fun annotateHttpsServer(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = Raise.ensureNotNull(node.getSourceFileOrNull()).fileName

    ensure(sourceFileName.endsWith("https.d.ts"))

    nullable {
        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "Server")

        "@Suppress(\"MANY_CLASSES_IN_SUPERTYPE_LIST\")"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isPropertyAccessExpression(expression))

        val expressionExpression = expression.expression
        ensure(isIdentifier(expressionExpression))
        ensure(expressionExpression.text == "http")

        val expressionName = expression.name
        ensure(isIdentifier(expressionName))
        ensure(expressionName.text == "Server")

        val heritageClause = Raise.ensureNotNull(node.getParentOrNull())
        ensure(isHeritageClause(heritageClause))

        val interfaceNode = ensureNotNull(heritageClause.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Server")

        "@seskar.js.JsMixin"
    }
}
