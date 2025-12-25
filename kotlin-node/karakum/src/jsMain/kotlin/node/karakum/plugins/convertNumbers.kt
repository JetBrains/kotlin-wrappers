package node.karakum.plugins

import typescript.*

val convertNumbers = createNumberPlugin(
    "Int" to {
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
