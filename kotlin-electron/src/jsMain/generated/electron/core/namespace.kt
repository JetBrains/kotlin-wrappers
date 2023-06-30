@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.events.EventEmitter

external val NodeEventEmitter: /* import('events') */ EventEmitter

external val app: App

external val autoUpdater: AutoUpdater

external val clipboard: Clipboard

external val contentTracing: ContentTracing

external val contextBridge: ContextBridge

external val crashReporter: CrashReporter

external val desktopCapturer: DesktopCapturer

external val dialog: Dialog

external val globalShortcut: GlobalShortcut

external val inAppPurchase: InAppPurchase

external val ipcMain: IpcMain

external val ipcRenderer: IpcRenderer

external val nativeImage: Any?

external val nativeTheme: NativeTheme

external val net: Net

external val netLog: NetLog

external val parentPort: ParentPort

external val powerMonitor: PowerMonitor

external val powerSaveBlocker: PowerSaveBlocker

external val protocol: Protocol

external val pushNotifications: PushNotifications

external val safeStorage: SafeStorage

external val screen: Screen

external val session: Any?

external val shell: Shell

external val systemPreferences: SystemPreferences

external val utilityProcess: Any?

external val webContents: Any?

external val webFrame: WebFrame

external val webFrameMain: Any?
