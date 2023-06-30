package electron.core


external interface RemoteMainInterface {
    var app: App
    var autoUpdater: AutoUpdater
    var BrowserView: Any?
    var BrowserWindow: Any?
    var clipboard: Clipboard
    var contentTracing: ContentTracing
    var crashReporter: CrashReporter
    var desktopCapturer: DesktopCapturer
    var dialog: Dialog
    var globalShortcut: GlobalShortcut
    var inAppPurchase: InAppPurchase
    var ipcMain: IpcMain
    var Menu: Any?
    var MenuItem: Any?
    var MessageChannelMain: Any?
    var nativeImage: Any?
    var nativeTheme: NativeTheme
    var net: Net
    var netLog: NetLog
    var Notification: Any?
    var powerMonitor: PowerMonitor
    var powerSaveBlocker: PowerSaveBlocker
    var protocol: Protocol
    var pushNotifications: PushNotifications
    var safeStorage: SafeStorage
    var screen: Screen
    var session: Any?
    var ShareMenu: Any?
    var shell: Shell
    var systemPreferences: SystemPreferences
    var TouchBar: Any?
    var Tray: Any?
    var utilityProcess: Any?
    var webContents: Any?
    var webFrameMain: Any?
}
