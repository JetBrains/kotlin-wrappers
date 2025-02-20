package wrappers.example.table.selection

import preact.signals.core.Signal
import tanstack.table.core.TableMeta

const val SELECTION_KEY = "selection"

internal fun TableMeta.getSelection(): Signal<SelectedKeys>? =
    get(SELECTION_KEY).unsafeCast<Signal<SelectedKeys>?>()
