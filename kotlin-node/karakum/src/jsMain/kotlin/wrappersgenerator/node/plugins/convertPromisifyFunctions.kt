package wrappersgenerator.node.plugins

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.createPlugin
import js.reflect.invoke
import typescript.ast.`is`.isFunctionDeclaration
import typescript.ast.`is`.isModuleBlock
import typescript.ast.`is`.isModuleDeclaration

val convertPromisifyFunctions = createPlugin { node, _, _ ->
    nullable {
        ensure(isModuleDeclaration(node))

        val body = ensureNotNull(node.body)
        ensure(isModuleBlock(body))
        ensure(body.statements.all {
            isFunctionDeclaration(it) && it.name?.text == "__promisify__"
        })

        ""
    } ?: nullable {
        ensure(isFunctionDeclaration(node))
        ensure(node.name?.text == "__promisify__")

        ""
    }
}
