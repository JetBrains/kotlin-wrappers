package wrappersgenerator.typescript.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isInterfaceDeclaration
import typescript.ast.`is`.isMethodSignature

suspend fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isMethodSignature(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable {
            ensure(
                name.text == "getCompilationSettings"
                        || name.text == "trace"
                        || name.text == "realpath"
                        || name.text == "fileExists"
                        || name.text == "getDirectories"
                        || name.text == "useCaseSensitiveFileNames",
            )

            val interfaceNode = ensureNotNull(node.parent)
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "LanguageServiceHost")

            "override"
        } ?: nullable {
            ensure(
                name.text == "fileExists"
                        || name.text == "readFile"
                        || name.text == "trace",
            )

            val interfaceNode = ensureNotNull(node.parent)
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ParseConfigHost")

            "override"
        } ?: nullable {
            ensure(name.text == "getCurrentDirectory")

            val interfaceNode = ensureNotNull(node.parent)
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "Program")

            "override"
        }
    }
}
