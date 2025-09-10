package typescript.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isIdentifier
import typescript.isInterfaceDeclaration
import typescript.isMethodSignature

fun modifyMethodInheritance(node: Node, context: InheritanceModifierContext) = nullable {
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
                        || name.text == "useCaseSensitiveFileNames"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "LanguageServiceHost")

            "override"
        } ?: nullable {
            ensure(
                name.text == "fileExists"
                        || name.text == "readFile"
                        || name.text == "trace"
            )

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "ParseConfigHost")

            "override"
        } ?: nullable {
            ensure(name.text == "getCurrentDirectory")

            val interfaceNode = ensureNotNull(node.getParentOrNull())
            ensure(isInterfaceDeclaration(interfaceNode))
            ensure(interfaceNode.name.text == "Program")

            "override"
        }
    }
}
