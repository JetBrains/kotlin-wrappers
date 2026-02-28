package tanstack.history.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import io.github.sgrishchenko.karakum.extension.renderNullable
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.asArray
import typescript.isFunctionTypeNode
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

val convertRouterHistoryProperty = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertySignature(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "RouterHistory")

        val type = ensureNotNull(node.type)

        val name = render(node.name)

        nullable {
            ensure(isFunctionTypeNode(type))

            val typeParameters = type.typeParameters?.asArray()
                ?.joinToString(", ") { render(it) }

            val returnType = render(type.type)

            convertParameterDeclarations(
                type, context, render,
                ParameterDeclarationsConfiguration(
                    strategy = ParameterDeclarationStrategy.function,
                    template = { parameters, _ ->
                        "fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it" }}"
                    }
                )
            )
        } ?: nullable {
            val isOptional = node.questionToken != null

            val type = renderNullable(node.type, isOptional, context, render)

            // TODO: use mutability modifier
            "val $name: $type"
        }
    }
}
