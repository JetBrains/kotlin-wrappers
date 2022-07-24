// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")
@file:JsNonModule

package tanstack.table.core

import kotlinx.js.ReadonlyArray

external fun <TNode> flattenBy(
    arr: ReadonlyArray<TNode>,
    getChildren: (item: TNode) -> ReadonlyArray<TNode>,
): ReadonlyArray<TNode>
