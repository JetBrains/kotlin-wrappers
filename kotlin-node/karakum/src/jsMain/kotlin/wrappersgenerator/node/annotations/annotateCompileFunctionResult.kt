package wrappersgenerator.node.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.*

suspend fun annotateCompileFunctionResult(node: Node, context: AnnotationContext) = nullable {
    val sourceFileName = ensureNotNull(node.getSourceFile()).fileName

    ensure(sourceFileName.endsWith("vm.d.ts"))

    nullable {
        ensure(context.isAnonymousDeclaration)

        ensure(isIntersectionTypeNode(node))

        val function = ensureNotNull(node.parent)
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

        val intersection = ensureNotNull(node.parent)
        ensure(isIntersectionTypeNode(intersection))

        val function = ensureNotNull(intersection.parent)
        ensure(isFunctionDeclaration(function))

        val functionName = ensureNotNull(function.name)
        ensure(functionName.text == "compileFunction")

        "@js.mixin.JsMixin"
    }
}
