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
        )
    ) {
        return "open"
    }

    return null
}
