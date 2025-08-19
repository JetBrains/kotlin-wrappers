package node.karakum.annotations

import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import node.karakum.util.nullable
import typescript.Node
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

fun annotateUnusedTypealiasParameter(node: Node, context: AnnotationContext) = nullable {
    ensure(isTypeParameterDeclaration(node))

    val typeAlias = ensureNotNull(node.getParentOrNull())
    ensure(isTypeAliasDeclaration(typeAlias))
    ensure(
        typeAlias.name.text == "WithImplicitCoercion"

                || typeAlias.name.text == "PipelineCallback"
                || typeAlias.name.text == "PipelineDestination"
                || typeAlias.name.text == "PipelinePromise"
                || typeAlias.name.text == "PipelineSource"
                || typeAlias.name.text == "PipelineSourceFunction"
                || typeAlias.name.text == "PipelineTransform"
                || typeAlias.name.text == "PipelineTransformSource"

                || typeAlias.name.text == "CustomPromisify"
    )

    "@Suppress(\"UNUSED_TYPEALIAS_PARAMETER\")"
}
