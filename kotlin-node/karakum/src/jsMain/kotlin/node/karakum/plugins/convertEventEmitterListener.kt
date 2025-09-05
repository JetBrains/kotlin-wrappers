package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import io.github.sgrishchenko.karakum.util.getSourceFileOrNull
import typescript.SyntaxKind
import typescript.asArray
import typescript.isIdentifier
import typescript.isParameter
import typescript.isTypeReferenceNode

val convertEventEmitterListener = createPlugin { node, _, render ->
    nullable {
        val sourceFileName = ensureNotNull(node.getSourceFileOrNull()).fileName
        ensure(sourceFileName.endsWith("events.d.ts"))

        ensure(isTypeReferenceNode(node))

        val name = node.typeName
        ensure(isIdentifier(name))
        ensure(name.text == "Function")

        val typeArguments = ensureNotNull(node.typeArguments)
        val firstTypeArgument = ensureNotNull(typeArguments.asArray().getOrNull(0))
        ensure(firstTypeArgument.kind == SyntaxKind.AnyKeyword)

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "listener")

        "${render(node.typeName)}<Unit>"
    }
}
