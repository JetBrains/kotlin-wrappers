package wrappersgenerator.tanstack.react.virtual.mutabilityModifiers

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

    val parent = typeScriptService.getParent(node) ?: return false
    val owner = typeScriptService.getParent(parent)?.takeIf(::isIntersectionTypeNode) ?: parent

    return "@kotlinx.js.JsPlainObject" in annotationService.resolveAnonymousAnnotations(owner, context)
}
