@file:JsModule("@tanstack/react-table")
@file:JsNonModule

package tanstack.react.table

import react.ComponentType
import react.Props
import react.ReactNode

external fun <TProps : Props> flexRender(
    Comp: ReactNode,
    props: TProps,
): ReactNode?

external fun <TProps : Props> flexRender(
    Comp: ComponentType<TProps>,
    props: TProps,
): ReactNode?
