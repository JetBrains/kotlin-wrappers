package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.*
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isTypeParameterDeclaration
import typescript.isTypeReferenceNode

val convertGetQueriesForElement = createPlugin { node, context, render ->
    nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "getQueriesForElement")

        val type = node.type?.let { render(it) }

        convertParameterDeclarations(
            node, context, render,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = { parameters, _ ->
                    // skip generics
                    "external suspend fun getQueriesForElement(${parameters})${ifPresent(type) { ": $it" }}"
                }
            )
        )
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "T")

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeName))

        val declaration = ensureNotNull(symbol.declarations?.firstOrNull())
        ensure(isTypeParameterDeclaration(declaration))

        val constraint = ensureNotNull(declaration.constraint)
        ensure(isTypeReferenceNode(constraint))

        val constraintTypeName = constraint.typeName
        ensure(isIdentifier(constraintTypeName))
        ensure(constraintTypeName.text == "QueriesToBind")

        "Queries"
    }
}
