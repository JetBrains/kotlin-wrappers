package wrappers.example.table.selection

import preact.signals.core.Signal
import react.RequiredContext
import react.createRequiredContext
import react.useRequired

internal val SelectedKeysContext: RequiredContext<Signal<SelectedKeys>> =
    createRequiredContext()

internal fun useSelectedKeys(): Signal<SelectedKeys> =
    useRequired(SelectedKeysContext)
