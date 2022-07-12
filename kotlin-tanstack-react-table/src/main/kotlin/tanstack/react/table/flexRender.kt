@file:JsModule("@tanstack/react-table")
@file:JsNonModule

package tanstack.react.table

import react.ReactNode
import tanstack.table.core.ColumnDefTemplate

external fun <T : Any> flexRender(
    Comp: ColumnDefTemplate<out () -> T>?,
    props: T
): ReactNode?
