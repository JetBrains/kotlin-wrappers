package tauri.apps.api.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import typescript.Node
import typescript.isClassDeclaration

fun modifyClassInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    ensure(isClassDeclaration(node))

    ensure(
        node.name?.text == "Resource"
                || node.name?.text == "MenuItemBase"
                || node.name?.text == "Menu"
                || node.name?.text == "Submenu"
                || node.name?.text == "WebviewWindow"
                || node.name?.text == "Webview"
                || node.name?.text == "Window"
    )

    "open"
}
