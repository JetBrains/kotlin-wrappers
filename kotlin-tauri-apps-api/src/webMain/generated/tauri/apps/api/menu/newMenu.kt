// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api")

package tauri.apps.api.menu


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
