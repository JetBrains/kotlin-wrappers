package electron.core


external interface FileFilter {
    // Docs: https://electronjs.org/docs/api/structures/file-filter
    var extensions: js.core.ReadonlyArray<String>
    var name: String
}
