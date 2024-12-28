import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertyDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                (
                    node.name.text === "accessibleTitle"
                    || node.name.text === "autoHideMenuBar"
                    || node.name.text === "closable"
                    || node.name.text === "documentEdited"
                    || node.name.text === "excludedFromShownWindowsMenu"
                    || node.name.text === "focusable"
                    || node.name.text === "fullScreen"
                    || node.name.text === "fullScreenable"
                    || node.name.text === "id"
                    || node.name.text === "kiosk"
                    || node.name.text === "maximizable"
                    || node.name.text === "menuBarVisible"
                    || node.name.text === "minimizable"
                    || node.name.text === "movable"
                    || node.name.text === "representedFilename"
                    || node.name.text === "resizable"
                    || node.name.text === "shadow"
                    || node.name.text === "simpleFullScreen"
                    || node.name.text === "tabbingIdentifier"
                    || node.name.text === "title"
                    || node.name.text === "visibleOnAllWorkspaces"
                )
                && node.parent
                && node.parent.name?.text === "BaseWindow"
            )
        )
    ) {
        return "open"
    }

    if (
        ts.isPropertyDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            (
                (
                    node.name.text === "accessibleTitle"
                    || node.name.text === "autoHideMenuBar"
                    || node.name.text === "closable"
                    || node.name.text === "documentEdited"
                    || node.name.text === "excludedFromShownWindowsMenu"
                    || node.name.text === "focusable"
                    || node.name.text === "fullScreen"
                    || node.name.text === "fullScreenable"
                    || node.name.text === "id"
                    || node.name.text === "kiosk"
                    || node.name.text === "maximizable"
                    || node.name.text === "menuBarVisible"
                    || node.name.text === "minimizable"
                    || node.name.text === "movable"
                    || node.name.text === "representedFilename"
                    || node.name.text === "resizable"
                    || node.name.text === "shadow"
                    || node.name.text === "simpleFullScreen"
                    || node.name.text === "tabbingIdentifier"
                    || node.name.text === "title"
                    || node.name.text === "visibleOnAllWorkspaces"
                )
                && node.parent
                && node.parent.name?.text === "BrowserWindow"
            )
        )
    ) {
        return "override"
    }

    return null
}
