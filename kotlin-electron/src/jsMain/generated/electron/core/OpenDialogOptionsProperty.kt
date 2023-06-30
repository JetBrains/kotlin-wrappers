package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{openFile: 'openFile', openDirectory: 'openDirectory', multiSelections: 'multiSelections', showHiddenFiles: 'showHiddenFiles', createDirectory: 'createDirectory', promptToCreate: 'promptToCreate', noResolveAliases: 'noResolveAliases', treatPackageAsDirectory: 'treatPackageAsDirectory', dontAddToRecent: 'dontAddToRecent'}/*union*/)""")
sealed external interface OpenDialogOptionsProperty {
    companion object {
        val openFile: OpenDialogOptionsProperty
        val openDirectory: OpenDialogOptionsProperty
        val multiSelections: OpenDialogOptionsProperty
        val showHiddenFiles: OpenDialogOptionsProperty
        val createDirectory: OpenDialogOptionsProperty
        val promptToCreate: OpenDialogOptionsProperty
        val noResolveAliases: OpenDialogOptionsProperty
        val treatPackageAsDirectory: OpenDialogOptionsProperty
        val dontAddToRecent: OpenDialogOptionsProperty
    }
}
