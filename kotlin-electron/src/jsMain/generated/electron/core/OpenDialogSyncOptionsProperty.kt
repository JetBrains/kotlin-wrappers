package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{openFile: 'openFile', openDirectory: 'openDirectory', multiSelections: 'multiSelections', showHiddenFiles: 'showHiddenFiles', createDirectory: 'createDirectory', promptToCreate: 'promptToCreate', noResolveAliases: 'noResolveAliases', treatPackageAsDirectory: 'treatPackageAsDirectory', dontAddToRecent: 'dontAddToRecent'}/*union*/)""")
sealed external interface OpenDialogSyncOptionsProperty {
    companion object {
        val openFile: OpenDialogSyncOptionsProperty
        val openDirectory: OpenDialogSyncOptionsProperty
        val multiSelections: OpenDialogSyncOptionsProperty
        val showHiddenFiles: OpenDialogSyncOptionsProperty
        val createDirectory: OpenDialogSyncOptionsProperty
        val promptToCreate: OpenDialogSyncOptionsProperty
        val noResolveAliases: OpenDialogSyncOptionsProperty
        val treatPackageAsDirectory: OpenDialogSyncOptionsProperty
        val dontAddToRecent: OpenDialogSyncOptionsProperty
    }
}
