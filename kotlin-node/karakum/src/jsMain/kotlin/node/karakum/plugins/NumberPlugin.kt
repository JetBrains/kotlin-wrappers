package node.karakum.plugins

import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.plugins.configurable.NumberPlugin
import io.github.sgrishchenko.karakum.extension.withName
import typescript.*

fun createNumberPlugin() = NumberPlugin(
    matchers = arrayOf(
        "Int" to match {
            match(::isClassDeclaration, withName("IncomingMessage")) {
                match(::isPropertyDeclaration, withName("statusCode"))
                    .match(::isUnionTypeNode)
            }

            match(::isInterfaceDeclaration, withName("Process")) {
                match(::isMethodSignature, withName("exit"))
                    .match(::isParameter, withName("code"))
                    .match(::isUnionTypeNode)
            }
        }
    )
)
