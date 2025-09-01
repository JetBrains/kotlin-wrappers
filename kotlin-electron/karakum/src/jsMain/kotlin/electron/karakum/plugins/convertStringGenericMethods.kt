package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationsConfiguration
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature
import typescript.isParameter
import typescript.isTypeReferenceNode

val convertStringGenericMethods = createPlugin { node, context, render ->
    nullable {
        ensure(isMethodSignature(node))

        val nameNode = node.name
        ensure(isIdentifier(nameNode))
        ensure(
            nameNode.text == "getUserDefault"
                    || nameNode.text == "setUserDefault"
        )

        val interfaceNode = ensureNotNull(node.getParentOrNull())
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "SystemPreferences")

        val name = render(node.name)

        val returnType = node.type?.let { render(it) }

        convertParameterDeclarations(
            node, context, render,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = { parameters, _ ->
                    // remove generics
                    "fun ${name}(${parameters}): $returnType"
                }
            )
        )
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Type")

        val parameter = ensureNotNull(node.getParentOrNull())
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.getParentOrNull())
        ensure(isMethodSignature(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))
        ensure(
            methodName.text == "getUserDefault"
                    || methodName.text == "setUserDefault"
        )

        "String"
    }
}
