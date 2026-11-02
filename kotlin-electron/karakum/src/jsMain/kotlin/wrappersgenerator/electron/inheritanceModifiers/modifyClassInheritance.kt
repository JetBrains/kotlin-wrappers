package wrappersgenerator.electron.inheritanceModifiers

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.InheritanceModifierContext
import js.reflect.invoke
import typescript.Node
import typescript.isClassDeclaration

private val OPEN_TYPES = setOf(
    "Tray",
    "TouchBar",
    "ShareMenu",
    "Notification",
    "MessageChannelMain",
    "MenuItem",
    "Menu",
    "BrowserWindow",
    "BrowserView",
    "BaseWindow",
    "View",
    "WebContentsView",
    "ImageView",
    "IpcMainServiceWorker",
    "WebSocket",
    "ClipboardItem",
)

suspend fun modifyClassInheritance(node: Node, context: InheritanceModifierContext) = nullable {
    ensure(isClassDeclaration(node))
    ensure(node.name?.text in OPEN_TYPES)

    "open"
}
