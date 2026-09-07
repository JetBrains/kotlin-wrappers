package wrappersgenerator.tanstack.react.virtual.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.*
import wrappersgenerator.tanstack.react.virtual.plugins.resolveDeclaration

// `ReactVirtualizer = Virtualizer & { ... }`
suspend fun annotateInterfaceWithSuperclass(node: Node, context: AnnotationContext) = nullable {
    ensure(isTypeAliasDeclaration(node))

    val type = node.type
    ensure(isIntersectionTypeNode(type))

    ensure(type.types.asArray().any { part ->
        isTypeReferenceNode(part) && resolveDeclaration(part.typeName, context)?.let(::isClassDeclaration) == true
    })

    "@Suppress(\"INTERFACE_WITH_SUPERCLASS\")"
}
