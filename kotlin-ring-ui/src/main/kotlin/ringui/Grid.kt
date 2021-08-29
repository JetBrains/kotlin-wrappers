@file:JsModule("@jetbrains/ring-ui/components/grid/grid")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName

external interface GridProps : PropsWithChildren, PropsWithClassName

external val Grid: ComponentClass<GridProps>

external interface RowProps : GridProps {
    var reverse: Boolean
    var start: RowPosition
    var center: RowPosition
    var end: RowPosition
    var top: RowPosition
    var middle: RowPosition
    var baseline: RowPosition
    var bottom: RowPosition
    var around: RowPosition
    var between: RowPosition
    var first: RowPosition
    var last: RowPosition
}

external val Row: ComponentClass<RowProps>

external interface ColProps : GridProps {
    var xs: Int // number or boolean
    var sm: Int // number or boolean
    var md: Int // number or boolean
    var lg: Int // number or boolean
    var xsOffset: Int
    var smOffset: Int
    var mdOffset: Int
    var lgOffset: Int
    var reverse: Boolean
}

external val Col: ComponentClass<ColProps>
