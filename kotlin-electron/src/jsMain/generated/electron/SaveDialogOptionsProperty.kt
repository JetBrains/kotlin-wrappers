package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{showHiddenFiles: 'showHiddenFiles', createDirectory: 'createDirectory', treatPackageAsDirectory: 'treatPackageAsDirectory', showOverwriteConfirmation: 'showOverwriteConfirmation', dontAddToRecent: 'dontAddToRecent'}/*union*/)""")
sealed external interface SaveDialogOptionsProperty {
    companion object {
        val showHiddenFiles: SaveDialogOptionsProperty
        val createDirectory: SaveDialogOptionsProperty
        val treatPackageAsDirectory: SaveDialogOptionsProperty
        val showOverwriteConfirmation: SaveDialogOptionsProperty
        val dontAddToRecent: SaveDialogOptionsProperty
    }
}
