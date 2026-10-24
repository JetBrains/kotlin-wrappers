package wrappersgenerator.semver.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.*

val convertCoerceParameterType = createPlugin { node, _, _ ->
    nullable {
        ensure(node.kind === SyntaxKind.NumberKeyword)

        val union = ensureNotNull(node.parent)
        ensure(isUnionTypeNode(union))

        val parameter = ensureNotNull(union.parent)
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "version")

        val function = ensureNotNull(parameter.parent)
        ensure(isFunctionDeclaration(function))
        ensure(function.name?.text == "coerce")

        "Number"
    }
}
