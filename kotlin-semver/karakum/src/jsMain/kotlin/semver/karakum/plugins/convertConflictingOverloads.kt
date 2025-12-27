package semver.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.Signature
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import typescript.*

private fun hasConflictingOverloads(node: FunctionDeclaration) = nullable {
    nullable {
        ensure(node.name?.text == "parse")
    }
} != null

private fun isConflictingOverload(node: FunctionDeclaration, signature: Signature) = nullable {
    nullable {
        ensure(node.name?.text == "parse")

        ensure(signature.size == 3)

        val parameter = signature[2]

        val parameterName = parameter.parameter.name
        ensure(isIdentifier(parameterName))
        ensure(parameterName.text == "throwErrors")

        val parameterType = ensureNotNull(parameter.type)
        ensure(isLiteralTypeNode(parameterType))
        val parameterTypeLiteral = parameterType.literal
        ensure(parameterTypeLiteral.kind == SyntaxKind.TrueKeyword)

    }
} != null

val convertConflictingOverloads = createPlugin { node, context, render ->
    nullable {
        ensure(isFunctionDeclaration(node))
        ensure(hasConflictingOverloads(node))

        val name = node.name?.let { render(it) } ?: "Anonymous"

        val typeParameters = node.typeParameters?.asArray()
            ?.joinToString(", ") { render(it) }

        val returnType = node.type?.let { render(it) }

        convertParameterDeclarations(node, context, render, ParameterDeclarationsConfiguration(
            strategy = ParameterDeclarationStrategy.function,
            template = template@{ parameters, signature ->
                if (isConflictingOverload(node, signature)) return@template ""

                "external fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it"}}"
            }
        ))
    }
}
