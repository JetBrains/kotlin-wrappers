// Automatically generated - do not modify!

package node.module

import node.Dict

/** @deprecated */
sealed external interface RequireExtensions : Dict<(module: Module, filename: String) -> Any?> {
    var `.js`: (module: Module, filename: String) -> Any?
    var `.json`: (module: Module, filename: String) -> Any?
    var `.node`: (module: Module, filename: String) -> Any?
}
