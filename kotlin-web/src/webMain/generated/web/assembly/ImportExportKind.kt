// Automatically generated - do not modify!

package web.assembly

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ImportExportKind

inline val ImportExportKind.Companion.function: ImportExportKind
    get() = unsafeCast("function")

inline val ImportExportKind.Companion.global: ImportExportKind
    get() = unsafeCast("global")

inline val ImportExportKind.Companion.memory: ImportExportKind
    get() = unsafeCast("memory")

inline val ImportExportKind.Companion.table: ImportExportKind
    get() = unsafeCast("table")

inline val ImportExportKind.Companion.tag: ImportExportKind
    get() = unsafeCast("tag")
