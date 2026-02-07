package testing.library.react.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

val convertQueriesGenerics = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeParameterDeclaration(node))
        ensure(node.name.text == "Q")

        val constraint = ensureNotNull(node.constraint)
        ensure(isTypeReferenceNode(constraint))

        val constraintTypeName = constraint.typeName
        ensure(isIdentifier(constraintTypeName))
        ensure(constraintTypeName.text == "Queries")

        // skip
        ""
    } ?: nullable {
        ensure(isTypeParameterDeclaration(node))

        val mappedType = ensureNotNull(node.getParentOrNull())
        ensure(isMappedTypeNode(mappedType))

        val constraint = ensureNotNull(node.constraint)
        ensure(isTypeOperatorNode(constraint))

        val constraintType = constraint.type
        ensure(isTypeReferenceNode(constraintType))

        val constraintTypeName = constraintType.typeName
        ensure(isIdentifier(constraintTypeName))
        ensure(constraintTypeName.text == "Q")

        val name = render(node.name)

        val renderedConstraintType = node.constraint?.let { render(it) }
        val defaultType = node.default?.let { render(it) }

        val bound = "${ifPresent(renderedConstraintType) { " : $it" }}${ifPresent(defaultType) { " default is $it" }}"

        // skip constraint
        "${name}${ifPresent(bound) { " /* $it */" }}"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "Q")

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeName))

        val declaration = ensureNotNull(symbol.declarations?.firstOrNull())
        ensure(isTypeParameterDeclaration(declaration))

        val constraint = ensureNotNull(declaration.constraint)
        ensure(isTypeReferenceNode(constraint))

        val constraintTypeName = constraint.typeName
        ensure(isIdentifier(constraintTypeName))
        ensure(constraintTypeName.text == "Queries")

        "testing.library.dom.Queries"
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(
            typeName.text == "RenderOptions"
                    || typeName.text == "RenderResult"
                    || typeName.text == "RenderHookOptions"
        )

        val typeArguments = node.typeArguments?.asArray()
            ?.filter { typeArgument ->
                nullable {
                    ensure(isTypeReferenceNode(typeArgument))

                    val typeArgumentsName = typeArgument.typeName
                    ensure(isIdentifier(typeArgumentsName))
                    ensure(typeArgumentsName.text == "Q")
                } == null
            }
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(separator = ", ")

        // skip Q generic
        "${render(typeName)}${ifPresent(typeArguments) { "<${it}>" }}"
    } ?: nullable {
        ensure(isExpressionWithTypeArguments(node))

        val expression = node.expression
        ensure(isIdentifier(expression))
        ensure(expression.text == "BaseRenderOptions")

        val typeArguments = node.typeArguments?.asArray()
            ?.filter { typeArgument ->
                nullable {
                    ensure(isTypeReferenceNode(typeArgument))

                    val typeArgumentsName = typeArgument.typeName
                    ensure(isIdentifier(typeArgumentsName))
                    ensure(typeArgumentsName.text == "Q")
                } == null
            }
            ?.map { render(it) }
            ?.filter { it.isNotEmpty() }
            ?.joinToString(separator = ", ")

        // skip Q generic
        "${render(expression)}${ifPresent(typeArguments) { "<${it}>" }}"
    }
}
