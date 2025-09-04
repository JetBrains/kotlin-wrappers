package electron.karakum.inheritanceModifiers

import electron.karakum.util.nullable
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

        nullable {
            ensure(
                name.text == "accessibleTitle"
                        || name.text == "autoHideMenuBar"
                        || name.text == "closable"
                        || name.text == "documentEdited"
                        || name.text == "excludedFromShownWindowsMenu"
                        || name.text == "focusable"
                        || name.text == "fullScreen"
                        || name.text == "fullScreenable"
                        || name.text == "id"
                        || name.text == "kiosk"
                        || name.text == "maximizable"
                        || name.text == "menuBarVisible"
                        || name.text == "minimizable"
                        || name.text == "movable"
                        || name.text == "representedFilename"
                        || name.text == "resizable"
                        || name.text == "shadow"
                        || name.text == "simpleFullScreen"
                        || name.text == "tabbingIdentifier"
                        || name.text == "title"
                        || name.text == "visibleOnAllWorkspaces"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "BaseWindow")

            "open"
        } ?: nullable {
            ensure(
                name.text == "accessibleTitle"
                        || name.text == "autoHideMenuBar"
                        || name.text == "closable"
                        || name.text == "documentEdited"
                        || name.text == "excludedFromShownWindowsMenu"
                        || name.text == "focusable"
                        || name.text == "fullScreen"
                        || name.text == "fullScreenable"
                        || name.text == "id"
                        || name.text == "kiosk"
                        || name.text == "maximizable"
                        || name.text == "menuBarVisible"
                        || name.text == "minimizable"
                        || name.text == "movable"
                        || name.text == "representedFilename"
                        || name.text == "resizable"
                        || name.text == "shadow"
                        || name.text == "simpleFullScreen"
                        || name.text == "tabbingIdentifier"
                        || name.text == "title"
                        || name.text == "visibleOnAllWorkspaces"
            )

            val classNode = ensureNotNull(node.getParentOrNull())
            ensure(isClassDeclaration(classNode))
            ensure(classNode.name?.text == "BrowserWindow")

            "override"
        }
    }
}
