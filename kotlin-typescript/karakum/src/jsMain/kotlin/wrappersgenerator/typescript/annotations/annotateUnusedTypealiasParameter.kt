package wrappersgenerator.typescript.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

suspend fun annotateUnusedTypealiasParameter(node: Node, context: AnnotationContext) = nullable {
    nullable {
        ensure(isTypeParameterDeclaration(node))

        val typeAlias = ensureNotNull(node.parent)
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(
            typeAlias.name.text == "InvalidatedProject"
                    || typeAlias.name.text == "VisitResult",
        )

        "@Suppress(\"UNUSED_TYPEALIAS_PARAMETER\")"
    } ?: nullable {
        ensure(isTypeParameterDeclaration(node))
        ensure(node.name.text == "TOut")

        val typeAlias = ensureNotNull(node.parent)
        ensure(isTypeAliasDeclaration(typeAlias))
        ensure(typeAlias.name.text == "Visitor")

        "@Suppress(\"UNUSED_TYPEALIAS_PARAMETER\")"
    }
}
