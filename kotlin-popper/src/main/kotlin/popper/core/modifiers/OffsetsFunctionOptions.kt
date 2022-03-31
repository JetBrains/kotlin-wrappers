package popper.core.modifiers

import popper.core.Placement
import popper.core.Rect

external interface OffsetsFunctionOptions {
    val popper: Rect
    val reference: Rect
    val placement: Placement
}
