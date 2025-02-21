package wrappers.example.table.selection

import preact.signals.core.ReadonlySignal
import preact.signals.react.useComputed

internal fun useIsChecked(
    keys: SelectedKeys,
    selection: Selection,
): ReadonlySignal<Boolean> = useComputed {
    selection.value.containsAll(keys)
}
