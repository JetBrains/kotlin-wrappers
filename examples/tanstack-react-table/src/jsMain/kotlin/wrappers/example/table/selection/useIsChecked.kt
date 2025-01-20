package wrappers.example.table.selection

import preact.signals.core.ReadonlySignal
import preact.signals.react.useComputed

internal fun useIsChecked(keys: SelectedKeys): ReadonlySignal<Boolean> {
    val selection = useSelectedKeys()

    return useComputed {
        selection.value.containsAll(keys)
    }
}
