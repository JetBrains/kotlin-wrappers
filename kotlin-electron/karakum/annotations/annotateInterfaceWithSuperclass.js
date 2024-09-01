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
    "Screen",
    "SystemPreferences",
    "WebFrame",
    "WebviewTag",

    // events
    "ConsoleMessageEvent",
    "ContextMenuEvent",
    "DevtoolsOpenUrlEvent",
    "DidChangeThemeColorEvent",
    "DidFailLoadEvent",
    "DidFrameFinishLoadEvent",
    "DidFrameNavigateEvent",
    "DidNavigateEvent",
    "DidNavigateInPageEvent",
    "DidRedirectNavigationEvent",
    "DidStartNavigationEvent",
    "FoundInPageEvent",
    "IpcMessageEvent",
    "LoadCommitEvent",
    "PageFaviconUpdatedEvent",
    "PageTitleUpdatedEvent",
    "PluginCrashedEvent",
    "RenderProcessGoneEvent",
    "UpdateTargetUrlEvent",
    "WillFrameNavigateEvent",
    "WillNavigateEvent",
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
