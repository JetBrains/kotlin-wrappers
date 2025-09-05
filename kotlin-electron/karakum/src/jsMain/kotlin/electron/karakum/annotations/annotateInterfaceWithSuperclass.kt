package electron.karakum.annotations

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.AnnotationContext
import typescript.Node
import typescript.isInterfaceDeclaration

private val interfacesWithSuperclass = setOf(
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
    "DevtoolsSearchQueryEvent",
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
)

fun annotateInterfaceWithSuperclass(node: Node, context: AnnotationContext) = nullable {
    ensure(isInterfaceDeclaration(node))
    ensure(node.name.text in interfacesWithSuperclass)

    "@Suppress(\"INTERFACE_WITH_SUPERCLASS\")"
}
