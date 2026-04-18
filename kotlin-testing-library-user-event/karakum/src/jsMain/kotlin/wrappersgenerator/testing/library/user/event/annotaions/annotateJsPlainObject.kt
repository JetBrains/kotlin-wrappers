package wrappersgenerator.testing.library.user.event.annotaions

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import io.github.sgrishchenko.karakum.extension.plugins.nameResolverServiceKey
import typescript.Node
import typescript.isIntersectionTypeNode

fun annotateJsPlainObject(node: Node, context: AnnotationContext) = nullable {
    val nameResolverService = context.requireService(nameResolverServiceKey)

    nullable {
        ensure(context.isAnonymousDeclaration)
        ensure(isIntersectionTypeNode(node))

        val name = nameResolverService.resolveName(node, context)

        ensure(
            name == "DirectTabOptions"
                    || name == "DirectTypeOptions"
        )

        "@kotlinx.js.JsPlainObject"
    }
}
