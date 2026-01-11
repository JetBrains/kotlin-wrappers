// Automatically generated - do not modify!

package tauri.apps.api.menu

// unhandled import: MenuItemOptions from "../menu"
// unhandled import: SubmenuOptions from "../menu"
// unhandled import: IconMenuItemOptions from "../menu"
// unhandled import: PredefinedMenuItemOptions from "../menu"
// unhandled import: CheckMenuItemOptions from "../menu"
// unhandled import: MenuItem from "./menuItem"
// unhandled import: CheckMenuItem from "./checkMenuItem"
// unhandled import: IconMenuItem from "./iconMenuItem"
// unhandled import: PredefinedMenuItem from "./predefinedMenuItem"
// unhandled import: Submenu from "./submenu"
// unhandled import: LogicalPosition from "../dpi"
// unhandled import: PhysicalPosition from "../dpi"
// unhandled import: Position from "../dpi"
// unhandled import: Window from "../window"
// unhandled import: MenuItemBase from "./base"

/** Options for creating a new menu. */
external interface MenuOptions {
    /** Specify an id to use for the new menu. */
    var id: String?

    /** List of items to add to the new menu. */
    var items:
            js.array.ReadonlyArray<Any /* Submenu | MenuItem | PredefinedMenuItem | CheckMenuItem | IconMenuItem | MenuItemOptions | SubmenuOptions | IconMenuItemOptions | PredefinedMenuItemOptions | CheckMenuItemOptions */>?
}
