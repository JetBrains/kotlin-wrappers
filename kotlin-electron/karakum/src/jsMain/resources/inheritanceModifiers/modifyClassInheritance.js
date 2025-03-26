import ts from "typescript"

export default (node) => {
    if (
        ts.isClassDeclaration(node)
        && node.name
        && (
            node.name.text === "Tray"
            || node.name.text === "TouchBar"
            || node.name.text === "ShareMenu"
            || node.name.text === "Notification"
            || node.name.text === "MessageChannelMain"
            || node.name.text === "MenuItem"
            || node.name.text === "Menu"
            || node.name.text === "BrowserWindow"
            || node.name.text === "BrowserView"
            || node.name.text === "BaseWindow"
            || node.name.text === "View"
            || node.name.text === "WebContentsView"
            || node.name.text === "BrowserWindow"
        )
    ) {
        return "open"
    }

    return null
}
