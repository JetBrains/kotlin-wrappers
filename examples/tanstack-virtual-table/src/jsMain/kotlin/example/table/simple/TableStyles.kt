package example.table.simple

import react.FC
import react.Props
import react.dom.html.ReactHTML

private const val STYLES = """
   .row-0 {
        background-color: green;
    }
"""

internal val TableStyles: FC<Props> = FC {
    ReactHTML.style {
        +STYLES
    }
}
