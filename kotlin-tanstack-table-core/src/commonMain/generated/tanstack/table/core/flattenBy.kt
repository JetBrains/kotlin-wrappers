// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

import js.array.ReadonlyArray

external fun <TNode> flattenBy(
    arr: ReadonlyArray<TNode>,
    getChildren: (item: TNode) -> ReadonlyArray<TNode>,
): ReadonlyArray<TNode>
