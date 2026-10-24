package wrappersgenerator.tanstack.history.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import js.reflect.invoke
import typescript.asArray
import typescript.isFunctionTypeNode
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

val convertRouterHistoryProperty = createPlugin { node, context, render ->
    nullable {
        ensure(isPropertySignature(node))

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "RouterHistory")

        val type = ensureNotNull(node.type)
        ensure(isFunctionTypeNode(type))

        val name = render(node.name)

        val typeParameters = type.typeParameters?.asArray()
            ?.map { render(it) }
            ?.joinToString(", ")

        val returnType = render(type.type)

        convertParameterDeclarations(
            type, context, render,
            ParameterDeclarationStrategy.function,
        ) { parameters, _ ->
            "fun ${ifPresent(typeParameters) { "<${it}> " }}${name}(${parameters})${ifPresent(returnType) { ": $it" }}"
        }
    }
}
