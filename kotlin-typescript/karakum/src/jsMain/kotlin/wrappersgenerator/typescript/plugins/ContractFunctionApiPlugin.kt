package wrappersgenerator.typescript.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import io.github.sgrishchenko.karakum.util.escapeIdentifier
import js.reflect.invoke
import typescript.*

private fun isConflictingOverload(node: FunctionDeclaration) = nullable {
    ensure(node.name?.text == "isIterationStatement")

    val secondParameter = ensureNotNull(node.parameters.asArray().getOrNull(1))

    val secondParameterType = ensureNotNull(secondParameter.type)
    ensure(isLiteralTypeNode(secondParameterType))
} != null

val ContractFunctionApiPlugin = createPlugin { node, context, next ->
    nullable {
        ensure(isFunctionDeclaration(node))

        val type = ensureNotNull(node.type)
        ensure(isTypePredicateNode(type))

        // TODO: support asserts (returns() implies value)
        ensure(type.assertsModifier == null)

        val nameNode = ensureNotNull(node.name)

        val name = escapeIdentifier(next(nameNode))

        val typeType = ensureNotNull(type.type)

        val contractType = next(typeType)

        // TODO: support overloads?
        ensure(name != "isStringLiteralLike")

        convertParameterDeclarations(
            node, context, next,
            ParameterDeclarationStrategy.function,
        ) template@{ _, signature ->
            if (isConflictingOverload(node)) return@template ""
            val valueType = signature.singleOrNull()?.parameter?.type ?: return@template ""

            "external val ${name}: js.reflect.TypeGuard<${next(valueType)}, ${contractType}>"
        }
    }
}
