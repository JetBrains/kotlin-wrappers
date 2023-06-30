package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{showHiddenFiles: 'showHiddenFiles', createDirectory: 'createDirectory', treatPackageAsDirectory: 'treatPackageAsDirectory', showOverwriteConfirmation: 'showOverwriteConfirmation', dontAddToRecent: 'dontAddToRecent'}/*union*/)""")
sealed external interface SaveDialogSyncOptionsProperty {
    companion object {
        val showHiddenFiles: SaveDialogSyncOptionsProperty
        val createDirectory: SaveDialogSyncOptionsProperty
        val treatPackageAsDirectory: SaveDialogSyncOptionsProperty
        val showOverwriteConfirmation: SaveDialogSyncOptionsProperty
        val dontAddToRecent: SaveDialogSyncOptionsProperty
    }
}
