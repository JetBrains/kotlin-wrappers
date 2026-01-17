// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/menu/base")

package tauri.apps.api.menu.base

import tauri.apps.api.menu.checkMenuItem.CheckMenuItemOptions
import tauri.apps.api.menu.iconMenuItem.IconMenuItemOptions
import tauri.apps.api.menu.menu.MenuOptions
import tauri.apps.api.menu.menuItem.MenuItemOptions
import tauri.apps.api.menu.predefinedMenuItem.PredefinedMenuItemOptions
import tauri.apps.api.menu.submenu.SubmenuOptions

external fun newMenu(kind: ItemKind): js.promise.Promise<js.array.Tuple2<Double, String>>

external fun newMenu(
    kind: ItemKind,
    opts: MenuOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

external fun newMenu(
    kind: ItemKind,
    opts: MenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

external fun newMenu(
    kind: ItemKind,
    opts: SubmenuOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

external fun newMenu(
    kind: ItemKind,
    opts: PredefinedMenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

external fun newMenu(
    kind: ItemKind,
    opts: CheckMenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

external fun newMenu(
    kind: ItemKind,
    opts: IconMenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>
