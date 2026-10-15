package wrappersgenerator.tanstack.virtual.core.mutabilityModifiers

import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.plugins.annotationServiceKey
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import io.github.sgrishchenko.karakum.extension.resolve
import typescript.Node
import typescript.isIntersectionTypeNode
import typescript.isPropertySignature

val modifyJsPlainObjectMutability = resolve(
    "val" to match(::isJsPlainObjectProperty),
)

private suspend fun isJsPlainObjectProperty(node: Node, context: Context): Boolean {
    if (!isPropertySignature(node)) return false

    val typeScriptService = context.requireService(typeScriptServiceKey)
    val annotationService = context.requireService(annotationServiceKey)

    var owner = typeScriptService.getParent(node) ?: return false

    typeScriptService.getParent(owner)
        ?.takeIf { isIntersectionTypeNode(it) }
        ?.let { owner = it }

    return "@kotlinx.js.JsPlainObject" in annotationService.resolveAnonymousAnnotations(owner, context)
}
