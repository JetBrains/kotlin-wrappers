// Automatically generated - do not modify!

package typescript

sealed external interface PasteEditsArgs {
    var targetFile: String
    var pastedText: js.array.ReadonlyArray<String>
    var pasteLocations: js.array.ReadonlyArray<TextRange>
    var copiedFrom: (PasteEditsArgsCopiedFrom)?
    var preferences: UserPreferences
}
