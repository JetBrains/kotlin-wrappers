// Automatically generated - do not modify!

package tauri.apps.api.menu.predefinedMenuItem

/** Options for creating a new predefined menu item. */
external interface PredefinedMenuItemOptions {
    /** The text of the new predefined menu item. */
    var text: String?

    /** The predefined item type */
    var item: Any /* 'Separator' | 'Copy' | 'Cut' | 'Paste' | 'SelectAll' | 'Undo' | 'Redo' | 'Minimize' | 'Maximize' | 'Fullscreen' | 'Hide' | 'HideOthers' | 'ShowAll' | 'CloseWindow' | 'Quit' | 'Services' | {
    About: AboutMetadata | null;
} */
}
