package tauri.apps.api.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import io.github.sgrishchenko.karakum.util.getParentOrNull
import typescript.Node
import typescript.isClassDeclaration
import typescript.isIdentifier
import typescript.isPropertyDeclaration

fun modifyPropertyInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isPropertyDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable { // open
            ensure(
                name.text == "label"
                        || name.text == "listeners"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(
                classNode.name?.text == "Webview"
                        || classNode.name?.text == "Window"
            )

            "open"
        }
    }
}
