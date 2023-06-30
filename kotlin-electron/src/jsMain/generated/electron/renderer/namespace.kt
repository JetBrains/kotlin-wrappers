@file:JsModule("electron/electron")
@file:JsQualifier("Electron.Renderer")

package electron.renderer

external val contextBridge: ContextBridge

external val ipcRenderer: IpcRenderer

external val webFrame: WebFrame
