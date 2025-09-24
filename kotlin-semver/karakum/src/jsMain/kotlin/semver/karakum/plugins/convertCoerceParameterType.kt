package semver.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.SyntaxKind
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isParameter
import typescript.isUnionTypeNode

val convertCoerceParameterType = createPlugin { node, _, _ ->
    nullable {
        ensure(node.kind === SyntaxKind.NumberKeyword)

        val union = ensureNotNull(node.getParentOrNull())
        ensure(isUnionTypeNode(union))

        val parameter = ensureNotNull(union.getParentOrNull())
        ensure(isParameter(parameter))

        val parameterName = parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "version")

        val function = ensureNotNull(parameter.getParentOrNull())
        ensure(isFunctionDeclaration(function))
        ensure(function.name?.text == "coerce")

        "Number"
    }
}
