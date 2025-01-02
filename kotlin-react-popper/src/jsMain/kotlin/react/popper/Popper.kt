@file:JsModule("react-popper")

package react.popper

import js.array.ReadonlyArray
import js.promise.Promise
import popper.core.*
import popper.core.State
import react.*

external interface PopperArrowProps :
    PropsWithRef<Any>,
    PropsWithStyle

external interface PopperChildrenProps :
    PropsWithRef<Any>,
    PropsWithStyle {

    var placement: Placement
    var isReferenceHidden: Boolean
    var hasPopperEscaped: Boolean

    var update: () -> Promise<State?>
    var forceUpdate: () -> State?
    var arrowProps: PopperArrowProps
}

external interface PopperProps : Props {
    var children: FC<PopperChildrenProps>
    var innerRef: Ref<*>
    var modifiers: ReadonlyArray<Modifier<*>>
    var placement: Placement
    var strategy: PositioningStrategy
    var referenceElement: ReferenceElement
    var onFirstUpdate: (state: State) -> Unit
}

external val Popper: ComponentType<PopperProps>
