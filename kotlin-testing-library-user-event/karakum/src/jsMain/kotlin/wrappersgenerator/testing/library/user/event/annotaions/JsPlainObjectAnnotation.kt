package wrappersgenerator.testing.library.user.event.annotaions

import io.github.sgrishchenko.karakum.extension.annotations.configurable.JsPlainObjectAnnotation
import io.github.sgrishchenko.karakum.extension.plugins.nameResolverServiceKey
import typescript.isTypeLiteralNode

fun createJsPlainObjectAnnotation() =
    JsPlainObjectAnnotation(ignore = { node, context ->
        val nameResolverService = context.requireService(nameResolverServiceKey)

        val name = nameResolverService.resolveName(node, context)

        context.isAnonymousDeclaration
                && isTypeLiteralNode(node)
                && (name == "UserEvent" || name == "UserEventApi")
    })
