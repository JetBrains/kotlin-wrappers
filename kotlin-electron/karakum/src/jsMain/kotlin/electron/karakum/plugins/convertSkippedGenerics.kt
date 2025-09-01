package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isExpressionWithTypeArguments
import typescript.isIdentifier
import typescript.isParameter
import typescript.isTypeAliasDeclaration
import typescript.isTypeReferenceNode

val convertSkippedGenerics = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Function")
        ensure(node.typeArguments == null)

        nullable {
            val parameter = ensureNotNull(node.getParentOrNull())
            ensure(isParameter(parameter))

            val parameterName = ensureNotNull(parameter.name)
            ensure(isIdentifier(parameterName))
            ensure(parameterName.text == "listener")

            "${render(node.typeName)}<Unit>"
        } ?: run {
            "${render(node.typeName)}<*>"
        }
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Event")
        ensure(node.typeArguments == null)

        nullable {
            val typeAlias = ensureNotNull(node.getParentOrNull())
            ensure(isTypeAliasDeclaration(typeAlias))

            render(node.typeName)
        } ?: run {
            "${render(node.typeName)}<*>"
        }
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Uint8Array")
        ensure(node.typeArguments == null)

        "${render(node.typeName)}<*>"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Buffer")
        ensure(node.typeArguments == null)

        "${render(node.typeName)}<*>"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "Event")
        ensure(node.typeArguments == null)

        "${render(node.expression)}<Any>"
    }
}
