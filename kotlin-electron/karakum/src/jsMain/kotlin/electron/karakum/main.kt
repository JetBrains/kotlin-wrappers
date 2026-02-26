package electron.karakum

import electron.karakum.annotations.annotateInterfaceWithSuperclass
import electron.karakum.annotations.annotateJsPlainObject
import electron.karakum.inheritanceModifiers.modifyClassInheritance
import electron.karakum.inheritanceModifiers.modifyMethodInheritance
import electron.karakum.inheritanceModifiers.modifyPropertyInheritance
import electron.karakum.injections.BrowserEventInjection
import electron.karakum.injections.EventInjection
import electron.karakum.nameResolvers.resolveConfigVersionName
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
import js.objects.unsafeJso

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
            ::resolveConfigVersionName,
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
        ignoreOutput = manyOf(
            "**/Document.kt",
        )
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
            "BaseWindow.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "BrowserWindow.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "ClientRequest.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Clipboard.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "Cookies.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Debugger.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "DownloadItem.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Extensions.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "IncomingMessage.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "IncomingMessageEvent.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "IpcMainServiceWorker.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Menu.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
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
            "NativeImage.kt" to arrayOf(
                "node.buffer.Buffer"
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
            "SafeStorage.kt" to arrayOf(
                "node.buffer.Buffer"
            ),
            "ServiceWorkers.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "Session.kt" to arrayOf(
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
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
                "node.buffer.Buffer",
                "node.events.EventEmitter as NodeEventEmitter"
            ),
            "WebFrameMain.kt" to arrayOf(
                "node.events.EventEmitter as NodeEventEmitter"
            ),
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
        compilerOptions = unsafeJso {
            lib = arrayOf(
                "lib.esnext.d.ts",
                "lib.dom.d.ts",
            )
        }
    }
}
