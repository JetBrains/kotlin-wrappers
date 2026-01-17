package electron.karakum

import electron.karakum.annotations.annotateInterfaceWithSuperclass
import electron.karakum.annotations.annotateJsPlainObject
import electron.karakum.inheritanceModifiers.modifyClassInheritance
import electron.karakum.inheritanceModifiers.modifyMethodInheritance
import electron.karakum.inheritanceModifiers.modifyPropertyInheritance
import electron.karakum.injections.BrowserEventInjection
import electron.karakum.injections.EventInjection
import electron.karakum.nameResolvers.resolveDownloadItemListenerStateName
import electron.karakum.nameResolvers.resolveInterfaceArrayFieldName
import electron.karakum.nameResolvers.resolveInterfaceMethodNullableCallbackParameterName
import electron.karakum.nameResolvers.resolveSessionListenerCallbackActionName
import electron.karakum.plugins.*
import io.github.sgrishchenko.karakum.configuration.*
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertElectronQualifiedName,
            convertEvent,
            convertFileHeritageClause,
            convertNodeJsNamespace,
            convertNodeJsQualifiedName,
            convertNodeRequire,
            convertOverriddenPropertySignature,
            convertSkippedGenerics,
            convertStringGenericMethods,
            convertTypealiasParameterBounds,
            convertUnknownRecordKeyType,
            convertUtilityTypes,
            convertWebviewGenericEventMethods,
        )
        injections = manyOf(
            BrowserEventInjection(),
            EventInjection(),
        )
        annotations = manyOf(
            ::annotateInterfaceWithSuperclass,
            ::annotateJsPlainObject,
        )
        nameResolvers = manyOf(
            ::resolveDownloadItemListenerStateName,
            ::resolveInterfaceArrayFieldName,
            ::resolveInterfaceMethodNullableCallbackParameterName,
            ::resolveSessionListenerCallbackActionName,
        )
        inheritanceModifiers = manyOf(
            ::modifyClassInheritance,
            ::modifyMethodInheritance,
            ::modifyPropertyInheritance,
        )

        input = manyOf("electron.d.ts")
        isolatedOutputPackage = true
        moduleNameMapper = recordOf(
            "electron/electron#Electron.Main" to "electron/main",
            "electron/electron#Electron.Common" to "electron/common",
            "electron/electron#Electron.Renderer" to "electron/renderer",
            "electron/electron#Electron.Utility" to "electron/utility",
            "electron/electron#Electron.CrossProcessExports" to "electron",
            "electron/electron#Electron" to "INTERNAL_ENTITY"
        )
        packageNameMapper = recordOf(
            "electron/([^/]+)\\.kt" to "electron/core/$1.kt",
            "electron/electron/(.+)\\.kt" to "electron/$1.kt",
            "electron/crossprocessexports/(.+)\\.kt" to "electron/$1.kt",
            "/([a-z][^/]+)\\.kt" to "/$1.val.kt"
        )
        importInjector = recordOf(
            "AddRepresentationOptions.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "App.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "AutoUpdater.kt" to arrayOf(
                "js.date.Date"
            ),
            "AutoUpdaterEvent.kt" to arrayOf(
                "js.date.Date"
            ),
            "BaseWindow.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "BrowserWindow.kt" to arrayOf(
                "js.promise.Promise",
                "node.buffer.Buffer"
            ),
            "ClientRequest.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Clipboard.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "ContentTracing.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "Cookies.kt" to arrayOf(
                "js.promise.Promise",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "CrashReport.kt" to arrayOf(
                "js.date.Date"
            ),
            "Debugger.kt" to arrayOf(
                "js.promise.Promise",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "DesktopCapturer.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "Dialog.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "Dock.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "DOMEvent.kt" to arrayOf(
                "web.events.Event",
                "web.events.EventTarget"
            ),
            "DownloadItem.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Extensions.kt" to arrayOf(
                "js.promise.Promise",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "IncomingMessage.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "IncomingMessageEvent.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "InAppPurchase.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "IpcMainServiceWorker.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "IpcRenderer.kt" to arrayOf(
                "js.promise.Promise",
                "web.messaging.MessagePort"
            ),
            "IpcRendererEvent.kt" to arrayOf(
                "web.messaging.MessagePort"
            ),
            "GlobalRequest.kt" to arrayOf(
                "web.http.Request"
            ),
            "GlobalResponse.kt" to arrayOf(
                "web.http.Response"
            ),
            "Menu.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "MessageBoxOptions.kt" to arrayOf(
                "web.abort.AbortSignal"
            ),
            "MessageChannelMain.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "MessagePortMain.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "MimeTypedBuffer.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "NavigationHistory.kt" to arrayOf(
                "js.promise.Promise",
            ),
            "NativeImage.kt" to arrayOf(
                "js.promise.Promise",
                "node.buffer.Buffer"
            ),
            "Net.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "NetFetchInit.kt" to arrayOf(
                "web.http.RequestInit"
            ),
            "NetLog.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "NodeEventEmitter.kt" to arrayOf(
                "node.events.EventEmitter"
            ),
            "Notification.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "ProcessEvent.kt" to arrayOf(
                "node.process.Process"
            ),
            "PushNotifications.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "SafeStorage.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "ServiceWorkers.kt" to arrayOf(
                "js.promise.Promise",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Session.kt" to arrayOf(
                "js.promise.Promise",
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "SessionFetchInit.kt" to arrayOf(
                "web.http.RequestInit"
            ),
            "SharedDictionaryInfo.kt" to arrayOf(
                "js.date.Date"
            ),
            "Shell.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "SystemPreferences.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "TextureInfo.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "TouchBarColorPicker.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarGroup.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarLabel.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarOtherItemsProxy.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarPopover.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarScrubber.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarSegmentedControl.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarSlider.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarSpacer.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Tray.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter",
                "electron.NativeImage"
            ),
            "UploadData.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "UploadRawData.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "UtilityProcess.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "View.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "WebContents.kt" to arrayOf(
                "js.promise.Promise",
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "WebFrame.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "WebFrameMain.kt" to arrayOf(
                "js.promise.Promise",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "WebviewTag.kt" to arrayOf(
                "js.promise.Promise",
                "js.typedarrays.Uint8Array",
                "web.html.HTMLElement"
            ),
            "WebUtils.kt" to arrayOf(
                "web.file.File"
            )
        )
        namespaceStrategy = recordOf(
            "Electron" to NamespaceStrategy.`package`,
            "electron" to NamespaceStrategy.ignore,
            "electron/main" to NamespaceStrategy.ignore,
            "electron/common" to NamespaceStrategy.ignore,
            "electron/renderer" to NamespaceStrategy.ignore,
            "original-fs" to NamespaceStrategy.ignore
        )
        conflictResolutionStrategy = recordOf(
            "DownloadItemDoneListenerState" to ConflictResolutionStrategy.replace,
            "DownloadItemUpdatedListenerState" to ConflictResolutionStrategy.replace
        )
    }
}
