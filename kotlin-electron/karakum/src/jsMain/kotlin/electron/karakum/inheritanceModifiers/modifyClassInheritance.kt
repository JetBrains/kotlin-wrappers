package electron.karakum.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import typescript.Node
import typescript.isClassDeclaration

fun modifyClassInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    ensure(isClassDeclaration(node))
    ensure(
        node.name?.text == "Tray"
                || node.name?.text == "TouchBar"
                || node.name?.text == "ShareMenu"
                || node.name?.text == "Notification"
                || node.name?.text == "MessageChannelMain"
                || node.name?.text == "MenuItem"
                || node.name?.text == "Menu"
                || node.name?.text == "BrowserWindow"
                || node.name?.text == "BrowserView"
                || node.name?.text == "BaseWindow"
                || node.name?.text == "View"
                || node.name?.text == "WebContentsView"
                || node.name?.text == "ImageView"
                || node.name?.text == "IpcMainServiceWorker"
    )

    "open"
}
