package wrappersgenerator.tauri.apps.api.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import js.reflect.invoke
import typescript.ast.Node
import typescript.ast.`is`.isClassDeclaration
import typescript.ast.`is`.isIdentifier
import typescript.ast.`is`.isPropertyDeclaration

suspend fun modifyPropertyInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    nullable {
        ensure(isPropertyDeclaration(node))

        val name = node.name
        ensure(isIdentifier(name))

        nullable { // open
            ensure(
                name.text == "label"
                        || name.text == "listeners",
            )

            val classNode = ensureNotNull(node.parent)
            ensure(isClassDeclaration(classNode))
            ensure(
                classNode.name?.text == "Webview"
                        || classNode.name?.text == "Window",
            )

            "open"
        }
    }
}
