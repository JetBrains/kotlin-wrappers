package wrappers.example.table.selection

import preact.signals.core.ReadonlySignal
import preact.signals.core.Signal
import preact.signals.react.useComputed

internal fun useIsChecked(
    keys: SelectedKeys,
    selection: Signal<SelectedKeys>,
): ReadonlySignal<Boolean> = useComputed {
    selection.value.containsAll(keys)
}
