package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.extension.plugins.*
import typescript.SymbolFlags
import typescript.isFunctionDeclaration
import typescript.isIdentifier
import typescript.isTypeParameterDeclaration
import typescript.isTypeQueryNode
import typescript.isTypeReferenceNode
import typescript.isVariableDeclaration

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
                    "external fun getQueriesForElement(${parameters})${ifPresent(type) { ": $it" }}"
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
    } ?: nullable {
        ensure(isVariableDeclaration(node))

        val type = ensureNotNull(node.type)
        ensure(isTypeQueryNode(type))

        val typeName = type.exprName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "getQueriesForElement")

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        var symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeName))

        // TODO: provide bit mask for TypeFlags
        if ((symbol.flags.toString().toInt() and SymbolFlags.Alias.toString().toInt()) != 0) {
            symbol = typeChecker.getAliasedSymbol(symbol)
        }

        val declarations = symbol.declarations
        ensure(declarations?.size == 1)

        val declaration = ensureNotNull(declarations.firstOrNull())
        ensure(isFunctionDeclaration(declaration))

        val name = render(node.name)

        val declarationType = declaration.type?.let { render(it) }

        convertParameterDeclarations(
            declaration, context, render,
            ParameterDeclarationsConfiguration(
                strategy = ParameterDeclarationStrategy.function,
                template = { parameters, _ ->
                    // skip generics
                    "external fun ${name}(${parameters})${ifPresent(declarationType) { ": $it" }}"
                }
            )
        )
    }
}
