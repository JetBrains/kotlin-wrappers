package wrappersgenerator.testing.library.dom.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.*
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature

val convertJsPlainObjectMethods = createPlugin { node, context, render ->
    nullable {
        ensure(isMethodSignature(node))

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))

        ensure(
            interfaceNode.name.text == "Config"
        )

        val typeScriptService = context.lookupService(typeScriptServiceKey)

        val name = render(node.name)

        if (node.typeParameters != null) {
            "var $name: Function<Any?> /* ${typeScriptService?.printNode(node)} */"
        } else {
            val returnType = node.type?.let { render(it) } ?: "Unit"

            convertParameterDeclarations(node, context, render, ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.lambda,
                template = { parameters, _ ->
                    "var ${name}: (${parameters}) -> $returnType"
                }
            ))
        }
    }
}
