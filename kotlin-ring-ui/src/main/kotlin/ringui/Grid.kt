@file:JsModule("@jetbrains/ring-ui/components/grid/grid")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.PropsWithChildren
import react.dom.WithClassName

external interface GridProps : PropsWithChildren

external val Grid: ComponentClass<GridProps>

external interface RowProps : GridProps, WithClassName {
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

external interface ColProps : GridProps, WithClassName {
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
