package testing.library.dom.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

private val asyncQueriesTypes = setOf(
    "FindAllBy",
    "FindAllByBoundAttribute",
    "FindAllByRole",
    "FindAllByText",
    "FindBy",
    "FindByBoundAttribute",
    "FindByRole",
    "FindByText",
)

private val queriesTypes = asyncQueriesTypes + setOf(
    "AllByBoundAttribute",
    "AllByRole",
    "AllByText",
    "GetAllBy",
    "GetBy",
    "GetByBoundAttribute",
    "GetByRole",
    "GetByText",
    "QueryArgs",
    "QueryBy",
    "QueryByBoundAttribute",
    "QueryByRole",
    "QueryByText",
)

val convertTypealiasParameterBounds = createPlugin { node, _, render ->
    nullable {
        ensure(isTypeParameterDeclaration(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(
            typeAlias.name.text == "QueryMethod"
                    || typeAlias.name.text == "BuiltQueryMethods"
                    || typeAlias.name.text == "GetErrorFunction"
                    || typeAlias.name.text in queriesTypes
        )

        val name = render(node.name)

        val constraintType = node.constraint?.let { render(it) }
        val defaultType = node.default?.let { render(it) }

        val bound = "${ifPresent(constraintType) { " : $it" }}${ifPresent(defaultType) { " default is $it" }}"

        "${name}${ifPresent(bound) { " /* $it */" }}"
    }
}
