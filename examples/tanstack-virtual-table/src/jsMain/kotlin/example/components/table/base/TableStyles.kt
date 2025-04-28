package example.table.simple

import react.FC
import react.Props
import react.dom.html.ReactHTML.style

private const val STYLES = """
    table {
       tbody {
           tr.row-1 {
                background-color: green;
           }
       }
    }
"""

internal val TableStyles: FC<Props> = FC {
    style {
        +STYLES
    }
}
