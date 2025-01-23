package wrappers.example.table.selection

import preact.signals.core.ReadonlySignal
import preact.signals.react.useComputed

internal fun useIsChecked(
    keys: SelectedKeys,
    metadata: TableMetadata,
): ReadonlySignal<Boolean> = useComputed {
    metadata.selection.value.containsAll(keys)
}
