package electron.karakum.plugins

import electron.karakum.util.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import io.github.sgrishchenko.karakum.extension.ifPresent
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

val convertTypealiasParameterBounds = createPlugin { node, context, render ->
    nullable {
        ensure(isTypeParameterDeclaration(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "Event")

        val name = render(node.name)

        val constraintType = node.constraint?.let { render(it) }
        val defaultType = node.default?.let { render(it) }

        val bound = "${ifPresent(constraintType) { " : $it" }}${ifPresent(defaultType) { " default is $it" }}"

        "${name}${ifPresent(bound) { " /* $it */" }}"
    }
}
