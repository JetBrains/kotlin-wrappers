import ts from "typescript"

const interfacesWithSuperclass = [
    "App",
    "AutoUpdater",
    "InAppPurchase",
    "IpcMain",
    "IpcRenderer",
    "NativeTheme",
    "ParentPort",
    "PowerMonitor",
    "PushNotifications",
    "SafeStorage",
    "Screen",
    "SystemPreferences",
    "WebFrame",
    "WebviewTag",
]

export default (node) => {
    if (
        ts.isInterfaceDeclaration(node)
        && interfacesWithSuperclass.some(name => node.name.text === name)
    ) {
        return `@Suppress("INTERFACE_WITH_SUPERCLASS")`
    }

    return null
}
