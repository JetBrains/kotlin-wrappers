// Automatically generated - do not modify!

@file:JsModule("@tauri-apps/api/menu/base")

package tauri.apps.api.menu.base

import tauri.apps.api.menu.*

/**
 * Creates a menu or menu item on the Rust side. Implementation detail of the
 * `new` static methods of the menu classes.
 *
 * @ignore
 */
external fun newMenu(kind: ItemKind): js.promise.Promise<js.array.Tuple2<Double, String>>

/**
 * Creates a menu or menu item on the Rust side. Implementation detail of the
 * `new` static methods of the menu classes.
 *
 * @ignore
 */
external fun newMenu(
    kind: ItemKind,
    opts: MenuOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

/**
 * Creates a menu or menu item on the Rust side. Implementation detail of the
 * `new` static methods of the menu classes.
 *
 * @ignore
 */
external fun newMenu(
    kind: ItemKind,
    opts: MenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

/**
 * Creates a menu or menu item on the Rust side. Implementation detail of the
 * `new` static methods of the menu classes.
 *
 * @ignore
 */
external fun newMenu(
    kind: ItemKind,
    opts: SubmenuOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

/**
 * Creates a menu or menu item on the Rust side. Implementation detail of the
 * `new` static methods of the menu classes.
 *
 * @ignore
 */
external fun newMenu(
    kind: ItemKind,
    opts: PredefinedMenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

/**
 * Creates a menu or menu item on the Rust side. Implementation detail of the
 * `new` static methods of the menu classes.
 *
 * @ignore
 */
external fun newMenu(
    kind: ItemKind,
    opts: CheckMenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>

/**
 * Creates a menu or menu item on the Rust side. Implementation detail of the
 * `new` static methods of the menu classes.
 *
 * @ignore
 */
external fun newMenu(
    kind: ItemKind,
    opts: IconMenuItemOptions = definedExternally,
): js.promise.Promise<js.array.Tuple2<Double, String>>
