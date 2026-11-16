package wrappersgenerator.tanstack.react.virtual.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isClassDeclaration
import typescript.ast.`is`.isIntersectionTypeNode
import typescript.ast.`is`.isTypeAliasDeclaration
import typescript.ast.`is`.isTypeReferenceNode
import wrappersgenerator.tanstack.react.virtual.resolveDeclaration

// `ReactVirtualizer = Virtualizer & { ... }`
suspend fun annotateInterfaceWithSuperclass(node: Node, context: AnnotationContext) = nullable {
    ensure(isTypeAliasDeclaration(node))

    val type = node.type
    ensure(isIntersectionTypeNode(type))

    ensure(type.types.any { part ->
        isTypeReferenceNode(part) && resolveDeclaration(part.typeName, context)?.let { isClassDeclaration(it) } == true
    })

    "@Suppress(\"INTERFACE_WITH_SUPERCLASS\")"
}
