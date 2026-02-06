package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import typescript.*

val convertFunctionInterfaces = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeAliasDeclaration(node))

        val name = render(node.name)
        ensure(
            name == "CreateFunction"
                    || name == "FireFunction"
        )

        val type = node.type
        ensure(isFunctionTypeNode(type))

        val returnType = render(type.type)

        val body = convertParameterDeclarations(type, context, render, ParameterDeclarationsConfiguration(
            strategy = ParameterDeclarationStrategy.function,
            template = { parameters, _ ->
                """
                    operator fun invoke(${parameters})${ifPresent(returnType) { ": $it" }}
                """.trimIndent()
            }
        ))

        """
            external interface $name {
            $body
            }
        """.trimIndent()
    }
}
