package wrappersgenerator.tanstack.history.mutabilityModifiers

import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.resolve
import io.github.sgrishchenko.karakum.extension.withName
import typescript.isFunctionTypeNode
import typescript.isInterfaceDeclaration
import typescript.isPropertySignature

val modifyRouterHistoryMutability = resolve(
    "val" to match {
        match(::isInterfaceDeclaration, withName("RouterHistory"))
            .match { node, _ ->
                isPropertySignature(node)
                        && node.type?.let { !isFunctionTypeNode(it) } ?: true
            }
    }
)
