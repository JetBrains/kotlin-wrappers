// Automatically generated - do not modify!

package muix.tree.view

import js.reflect.unsafeCast
import react.Props

/**
 * The props of a slot: a props object, or a function of the slot's owner state that returns one
 * (`SlotComponentProps<Component, Overrides, OwnerState>` from `@mui/utils/types`).
 */
sealed /* union */
external interface SlotComponentProps<P : Props, S>

inline fun <P : Props, S> SlotComponentProps(
    props: P,
): SlotComponentProps<P, S> =
    unsafeCast(props)

inline fun <P : Props, S> SlotComponentProps(
    noinline resolve: (ownerState: S) -> P,
): SlotComponentProps<P, S> =
    unsafeCast(resolve)
