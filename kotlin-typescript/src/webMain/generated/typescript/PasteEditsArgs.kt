// Automatically generated - do not modify!

package typescript

@kotlinx.js.JsPlainObject
external interface PasteEditsArgs {
    var targetFile: String
    var pastedText: js.array.ReadonlyArray<String>
    var pasteLocations: js.array.ReadonlyArray<TextRange>
    var copiedFrom: (PasteEditsArgsCopiedFrom)?
    var preferences: UserPreferences
}
