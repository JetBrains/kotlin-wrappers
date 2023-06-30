package electron.core


external interface RelaunchOptions {
    var args: js.core.ReadonlyArray<String>?
    var execPath: String?
}
