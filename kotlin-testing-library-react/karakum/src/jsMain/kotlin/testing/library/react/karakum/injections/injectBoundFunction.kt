package testing.library.react.karakum.injections

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.HERITAGE_CLAUSE
import io.github.sgrishchenko.karakum.extension.InjectionType
import io.github.sgrishchenko.karakum.extension.createInjection
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.isIntersectionTypeNode
import typescript.isTypeAliasDeclaration

val injectBoundFunction = createInjection { node, context, _ ->
    nullable {
        ensure(isIntersectionTypeNode(node))

        val typeAlias = ensureNotNull(node.getParentOrNull())
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "RenderResult")

        ensure(context.type == InjectionType.HERITAGE_CLAUSE)

        arrayOf("testing.library.dom.BoundFunctions")
    }
}
