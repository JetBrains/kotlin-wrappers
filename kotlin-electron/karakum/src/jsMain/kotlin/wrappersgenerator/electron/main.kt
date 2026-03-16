package wrappersgenerator.electron

import io.github.sgrishchenko.karakum.configuration.*
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import js.objects.unsafeJso
import wrappersgenerator.electron.annotations.annotateInterfaceWithSuperclass
import wrappersgenerator.electron.annotations.annotateJsPlainObject
import wrappersgenerator.electron.inheritanceModifiers.modifyClassInheritance
import wrappersgenerator.electron.inheritanceModifiers.modifyMethodInheritance
import wrappersgenerator.electron.inheritanceModifiers.modifyPropertyInheritance
import wrappersgenerator.electron.injections.BrowserEventInjection
import wrappersgenerator.electron.injections.EventInjection
import wrappersgenerator.electron.nameResolvers.*
import wrappersgenerator.electron.plugins.*

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
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
        injections = listOf(
            BrowserEventInjection(),
            EventInjection(),
        )
        annotations = listOf(
            ::annotateInterfaceWithSuperclass,
            ::annotateJsPlainObject,
        )
        nameResolvers = listOf(
            ::resolveConfigVersionName,
            ::resolveDownloadItemListenerStateName,
            ::resolveInterfaceArrayFieldName,
            ::resolveInterfaceMethodNullableCallbackParameterName,
            ::resolveSessionListenerCallbackActionName,
        )
        inheritanceModifiers = listOf(
            ::modifyClassInheritance,
            ::modifyMethodInheritance,
            ::modifyPropertyInheritance,
        )

        input = listOf("electron.d.ts")
        ignoreOutput = listOf(
            "**/Document.kt",
        )
        isolatedOutputPackage = true
        moduleNameMapper = mapOf(
            "electron/electron#Electron.Main" to "electron/main",
            "electron/electron#Electron.Common" to "electron/common",
            "electron/electron#Electron.Renderer" to "electron/renderer",
            "electron/electron#Electron.Utility" to "electron/utility",
            "electron/electron#Electron.CrossProcessExports" to "electron",
            "electron/electron#Electron" to "INTERNAL_ENTITY"
        )
        packageNameMapper = mapOf(
            "electron/([^/]+)\\.kt" to "electron/core/$1.kt",
            "electron/electron/(.+)\\.kt" to "electron/$1.kt",
            "electron/crossprocessexports/(.+)\\.kt" to "electron/$1.kt",
            "/([a-z][^/]+)\\.kt" to "/$1.val.kt"
        )
        importInjector = mapOf(
            "AddRepresentationOptions.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "BaseWindow.kt" to listOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "BrowserWindow.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "ClientRequest.kt" to listOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Clipboard.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "Cookies.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Debugger.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "DownloadItem.kt" to listOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Extensions.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "IncomingMessage.kt" to listOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "IncomingMessageEvent.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "IpcMainServiceWorker.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Menu.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "MessageChannelMain.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "MessagePortMain.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "MimeTypedBuffer.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "NativeImage.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "NodeEventEmitter.kt" to listOf(
                "node.events.EventEmitter"
            ),
            "Notification.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "ProcessEvent.kt" to listOf(
                "node.process.Process"
            ),
            "SafeStorage.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "ServiceWorkers.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Session.kt" to listOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "SharedTextureHandle.kt" to listOf(
                "node.buffer.Buffer",
            ),
            "TextureInfo.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "TouchBarColorPicker.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarGroup.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarLabel.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarOtherItemsProxy.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarPopover.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarScrubber.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarSegmentedControl.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarSlider.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "TouchBarSpacer.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Tray.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter",
                "electron.NativeImage"
            ),
            "UploadData.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "UploadRawData.kt" to listOf(
                "node.buffer.Buffer"
            ),
            "UtilityProcess.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "View.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "WebContents.kt" to listOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "WebFrameMain.kt" to listOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
        )
        namespaceStrategy = mapOf(
            "Electron" to NamespaceStrategy.`package`,
            "electron" to NamespaceStrategy.ignore,
            "electron/main" to NamespaceStrategy.ignore,
            "electron/common" to NamespaceStrategy.ignore,
            "electron/renderer" to NamespaceStrategy.ignore,
            "original-fs" to NamespaceStrategy.ignore
        )
        conflictResolutionStrategy = mapOf(
            "DownloadItemDoneListenerState" to ConflictResolutionStrategy.replace,
            "DownloadItemUpdatedListenerState" to ConflictResolutionStrategy.replace
        )
        compilerOptions = unsafeJso {
            lib = arrayOf(
                "lib.esnext.d.ts",
                "lib.dom.d.ts",
            )
        }
    }
}
