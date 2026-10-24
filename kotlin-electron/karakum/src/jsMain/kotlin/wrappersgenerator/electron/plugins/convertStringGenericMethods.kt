package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.ParameterDeclarationStrategy
import io.github.sgrishchenko.karakum.extension.plugins.convertParameterDeclarations
import io.github.sgrishchenko.karakum.extension.plugins.function
import js.reflect.invoke
import typescript.*

val convertStringGenericMethods = createPlugin { node, context, render ->
    nullable {
        ensure(isMethodSignature(node))

        val nameNode = node.name
        ensure(isIdentifier(nameNode))
        ensure(
            nameNode.text == "getUserDefault"
                    || nameNode.text == "setUserDefault",
        )

        val interfaceNode = ensureNotNull(node.parent)
        ensure(isInterfaceDeclaration(interfaceNode))
        ensure(interfaceNode.name.text == "SystemPreferences")

        val name = render(node.name)

        val returnType = node.type?.let { render(it) }

        convertParameterDeclarations(
            node, context, render,
            ParameterDeclarationStrategy.function,
        ) { parameters, _ ->
            // remove generics
            "fun ${name}(${parameters}): $returnType"
        }
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Type")

        val parameter = ensureNotNull(node.parent)
        ensure(isParameter(parameter))

        val method = ensureNotNull(parameter.parent)
        ensure(isMethodSignature(method))

        val methodName = method.name
        ensure(isIdentifier(methodName))
        ensure(
            methodName.text == "getUserDefault"
                    || methodName.text == "setUserDefault",
        )

        "String"
    }
}
