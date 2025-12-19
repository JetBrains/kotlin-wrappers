package node.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.*

fun annotateCompileFunctionResult(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName

    ensure(sourceFileName.endsWith("vm.d.ts"))

    nullable {
        ensure(context.isAnonymousDeclaration)

        ensure(isIntersectionTypeNode(node))

        val function = ensureNotNull(node.getParentOrNull())
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(functionName.text == "compileFunction")

        "@Suppress(\"INTERFACE_WITH_SUPERCLASS\", \"MANY_CLASSES_IN_SUPERTYPE_LIST\")"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val name = node.typeName
        ensure(isIdentifier(name))
        ensure(name.text == "Pick")

        val firstTypeArgument = ensureNotNull(node.typeArguments?.asArray()?.firstOrNull())
        ensure(isTypeReferenceNode(firstTypeArgument))

        val firstTypeArgumentName = firstTypeArgument.typeName
        ensure(isIdentifier(firstTypeArgumentName))
        ensure(firstTypeArgumentName.text == "Script")

        val intersection = ensureNotNull(node.getParentOrNull())
        ensure(isIntersectionTypeNode(intersection))

        val function = ensureNotNull(intersection.getParentOrNull())
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(functionName.text == "compileFunction")

        "@seskar.js.JsMixin"
    }
}
