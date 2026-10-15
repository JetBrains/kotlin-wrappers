package wrappersgenerator.tanstack.virtual.core.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import typescript.asArray
import typescript.isFunctionTypeNode
import typescript.isVariableDeclaration

// `const windowScroll: <T extends Window>(...) => void`
val convertGenericFunctionVariable = createPlugin { node, context, render ->
    nullable {
        ensure(isVariableDeclaration(node))

        val functionType = ensureNotNull(node.type)
        ensure(isFunctionTypeNode(functionType))

        val typeParameters = ensureNotNull(functionType.typeParameters)
            .asArray()
            .map { render(it) }
            .joinToString(", ")

        val name = render(node.name)
        val returnType = render(functionType.type)

        convertParameterDeclarations(
            functionType, context, render,
            ParameterDeclarationStrategy.function,
        ) { parameters, _ ->
            "external fun <$typeParameters> $name($parameters): $returnType"
        }
    }
}
