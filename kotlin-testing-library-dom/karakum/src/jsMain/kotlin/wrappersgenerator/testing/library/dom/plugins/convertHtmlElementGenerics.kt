package wrappersgenerator.testing.library.dom.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.*

private fun isHTMLElementTypeParameter(node: Node) = nullable {
    ensure(isTypeParameterDeclaration(node))
    ensure(node.name.text == "T")

    val constraint = ensureNotNull(node.constraint)
    ensure(isTypeReferenceNode(constraint))

    val constraintTypeName = constraint.typeName
    ensure(isIdentifier(constraintTypeName))
    ensure(constraintTypeName.text == "HTMLElement")

    val parent = ensureNotNull(node.getParentOrNull())

    ensureNotNull(
        nullable {
            ensure(isTypeAliasDeclaration(parent))
            ensure(
                parent.name.text in setOf(
                    "AllByBoundAttribute",
                    "AllByRole",
                    "AllByText",
                    "FindAllByBoundAttribute",
                    "FindAllByRole",
                    "FindAllByText",
                    "FindByBoundAttribute",
                    "FindByRole",
                    "FindByText",
                    "GetByBoundAttribute",
                    "GetByRole",
                    "GetByText",
                    "QueryByBoundAttribute",
                    "QueryByRole",
                    "QueryByText",
                )
            )
        } ?: nullable {
            ensure(isFunctionDeclaration(parent))

            val name = ensureNotNull(parent.name)
            ensure(
                name.text.startsWith("findAllBy")
                        || name.text.startsWith("findBy")
                        || name.text.startsWith("getAllBy")
                        || name.text.startsWith("getBy")
                        || name.text.startsWith("queryAllBy")
                        || name.text.startsWith("queryBy")
            )
        } ?: nullable {
            ensure(isMethodSignature(parent))

            val name = parent.name
            ensure(isIdentifier(name))
            ensure(
                name.text.startsWith("findAllBy")
                        || name.text.startsWith("findBy")
                        || name.text.startsWith("getAllBy")
                        || name.text.startsWith("getBy")
                        || name.text.startsWith("queryAllBy")
                        || name.text.startsWith("queryBy")
            )
        }
    )
} != null

val convertHtmlElementGenerics = createPlugin { node, context, _ ->
    nullable {
        ensure(isHTMLElementTypeParameter(node))

        // skip
        ""
    } ?: nullable {
        ensure(isTypeReferenceNode(node))

        val typeName = node.typeName
        ensure(isIdentifier(typeName))
        ensure(typeName.text == "T")

        val typeScriptService = ensureNotNull(context.lookupService(typeScriptServiceKey))
        val typeChecker = typeScriptService.program.getTypeChecker()

        val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeName))

        val declaration = ensureNotNull(symbol.declarations?.firstOrNull())
        ensure(isHTMLElementTypeParameter(declaration))

        "web.html.HTMLElement"
    }
}
