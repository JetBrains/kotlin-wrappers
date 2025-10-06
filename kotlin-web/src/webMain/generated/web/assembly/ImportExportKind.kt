// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.assembly

import js.reflect.unsafeCast

sealed external interface ImportExportKind {
    companion object
}

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
