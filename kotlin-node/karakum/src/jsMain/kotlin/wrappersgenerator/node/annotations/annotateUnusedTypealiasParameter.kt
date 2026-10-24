package wrappersgenerator.node.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import js.reflect.invoke
import typescript.Node
import typescript.isTypeAliasDeclaration
import typescript.isTypeParameterDeclaration

suspend fun annotateUnusedTypealiasParameter(node: Node, context: AnnotationContext) = nullable {
    ensure(isTypeParameterDeclaration(node))

    val typeAlias = ensureNotNull(node.parent)
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
