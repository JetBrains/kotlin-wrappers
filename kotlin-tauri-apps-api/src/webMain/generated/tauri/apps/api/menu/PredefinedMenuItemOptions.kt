// Automatically generated - do not modify!

package tauri.apps.api.menu

/** Options for creating a new predefined menu item. */
external interface PredefinedMenuItemOptions {
    /**
     * The text of the new predefined menu item.
     *
     * Defaults to the platform's own label for the chosen item, so only set it to
     * override or localize that label.
     */
    var text: String?

    /**
     * The predefined item type.
     *
     * Each variant maps to a native menu item whose behavior is implemented by the
     * operating system, so there is no `action` to handle. Variants that are
     * unsupported on a platform still create an item, but it does nothing there.
     *
     * - `Separator`: a horizontal separator line. All platforms.
     * - `Copy`, `Cut`, `Paste`, `SelectAll`: the standard clipboard and selection
     *   commands, applied to the focused text input. All platforms.
     * - `Undo`, `Redo`: undo/redo in the focused text input. **macOS only**
     *   (*Windows / Linux:* unsupported).
     * - `Minimize`: minimizes the focused window. *Linux:* unsupported.
     * - `Maximize`: maximizes the focused window. *Linux:* unsupported.
     * - `Fullscreen`: toggles fullscreen for the focused window. **macOS only**
     *   (*Windows / Linux:* unsupported).
     * - `Hide`: hides the application. *Linux:* unsupported.
     * - `HideOthers`: hides every other application. *Linux:* unsupported.
     * - `ShowAll`: shows all hidden applications. **macOS only**
     *   (*Windows / Linux:* unsupported).
     * - `CloseWindow`: closes the focused window. *Linux:* unsupported.
     * - `Quit`: quits the application. *Linux:* unsupported.
     * - `Services`: the macOS *Services* submenu. **macOS only**
     *   (*Windows / Linux:* unsupported).
     * - `BringAllToFront`: brings all of the app's windows to the front. **macOS only**
     *   (*Windows / Linux:* unsupported).
     * - `{ About: AboutMetadata | null }`: opens an about dialog. All platforms; pass
     *   `null` to use the values from your `tauri.conf.json`, or see
     *   {@linkcode AboutMetadata} for the per-field platform support.
     *
     * @example
     * ```typescript
     * import { Menu, PredefinedMenuItem, Submenu } from '@tauri-apps/api/menu';
     *
     * await using edit = await Submenu.new({
     *   text: 'Edit',
     *   items: [
     *     { item: 'Undo' },
     *     { item: 'Redo' },
     *     { item: 'Separator' },
     *     { item: 'Cut' },
     *     { item: 'Copy' },
     *     { item: 'Paste' },
     *     { item: 'SelectAll' }
     *   ]
     * });
     *
     * await using quit = await PredefinedMenuItem.new({ item: 'Quit', text: 'Quit my app' });
     * const menu = await Menu.new({ items: [edit, quit] });
     * ```
     */
    var item: Any /* 'Separator' | 'Copy' | 'Cut' | 'Paste' | 'SelectAll' | 'Undo' | 'Redo' | 'Minimize' | 'Maximize' | 'Fullscreen' | 'Hide' | 'HideOthers' | 'ShowAll' | 'CloseWindow' | 'Quit' | 'Services' | 'BringAllToFront' | {
    About: AboutMetadata | null;
} */
}
