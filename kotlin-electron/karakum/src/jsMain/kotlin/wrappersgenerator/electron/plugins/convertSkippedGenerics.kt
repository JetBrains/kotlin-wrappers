package wrappersgenerator.electron.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.*

val convertSkippedGenerics = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Function")
        ensure(node.typeArguments == null)

        nullable {
            val parameter = ensureNotNull(node.parent)
            ensure(isParameter(parameter))

            val parameterName = ensureNotNull(parameter.name)
            ensure(isIdentifier(parameterName))
            ensure(parameterName.text == "listener")

            "${render(typeName)}<Unit>"
        } ?: run {
            "${render(typeName)}<*>"
        }
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Event")
        ensure(node.typeArguments == null)

        nullable {
            val typeAlias = ensureNotNull(node.parent)
            ensure(isTypeAliasDeclaration(typeAlias))

            render(typeName)
        } ?: run {
            "${render(typeName)}<*>"
        }
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Uint8Array")
        ensure(node.typeArguments == null)

        "${render(typeName)}<*>"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Buffer" || typeName.text == "ArrayBufferView")
        ensure(node.typeArguments == null)

        "${render(typeName)}<*>"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "Event")
        ensure(node.typeArguments == null)

        "${render(expression)}<Any>"
    }
}
