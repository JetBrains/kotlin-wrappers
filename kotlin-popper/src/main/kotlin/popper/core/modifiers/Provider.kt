package popper.core.modifiers

import popper.core.Placement
import popper.core.Rect

external interface ProviderOptions {
    val popper: Rect
    val reference: Rect
    val placement: Placement
}

typealias Provider<T> = (
    options: ProviderOptions,
) -> T
