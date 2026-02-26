package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.plugins.configurable.NumberPlugin
import typescript.*

fun createNumberPlugin() = NumberPlugin(
    matchers = arrayOf(
        "Int" to match {
            match(::isClassDeclaration, "IncomingMessage") {
                match(::isPropertyDeclaration, "statusCode")
                    .match(::isUnionTypeNode)
            }

            match(::isInterfaceDeclaration, "Process") {
                match(::isMethodSignature, "exit")
                    .match(::isParameter, "code")
                    .match(::isUnionTypeNode)
            }
        }
    )
)
