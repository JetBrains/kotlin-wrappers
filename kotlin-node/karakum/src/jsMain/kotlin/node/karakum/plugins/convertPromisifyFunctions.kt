package node.karakum.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import typescript.asArray
import typescript.isFunctionDeclaration
import typescript.isModuleBlock
import typescript.isModuleDeclaration

val convertPromisifyFunctions = createPlugin { node, _, _ ->
    nullable {
        ensure(isModuleDeclaration(node))

        val body = ensureNotNull(node.body)
        ensure(isModuleBlock(body))
        ensure(body.statements.asArray().all {
            isFunctionDeclaration(it) && it.name?.text == "__promisify__"
        })

        ""
    } ?: nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "__promisify__")

        ""
    }
}
