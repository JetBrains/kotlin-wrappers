package wrappersgenerator.node.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

fun annotateDuplex(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    ensure(sourceFileName.endsWith("stream.d.ts"))

    nullable {
        ensure(isClassDeclaration(node))
        ensure(node.name?.text == "Duplex")

        "@Suppress(\"MANY_CLASSES_IN_SUPERTYPE_LIST\")"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(
            expression.text == "Readable"
                    || expression.text == "Writable"
        )

        val heritageClause = ensureNotNull(node.getParentOrNull())
        ensure(isHeritageClause(heritageClause))

        val interfaceNode = ensureNotNull(heritageClause.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "Duplex")

        "@seskar.js.JsMixin"
    }
}
