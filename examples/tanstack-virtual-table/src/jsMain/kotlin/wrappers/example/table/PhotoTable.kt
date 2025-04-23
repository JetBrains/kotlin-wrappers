package wrappers.example.table

import emotion.styled.styled
import react.FC
import react.dom.html.ReactHTML.div
import react.useRef
import tanstack.react.virtual.UseVirtualizerOptions
import web.cssom.Auto.Companion.auto
import web.cssom.Position
import web.cssom.pct
import web.cssom.vh
import web.dom.Element
import web.html.HTMLElement
import wrappers.example.table.selection.SelectionContext
import wrappers.example.table.selection.selection
import wrappers.example.table.simple.SimpleTable
import wrappers.example.table.simple.VirtualOptionsContext

internal val PhotoTable = FC {
    val table = usePhotoTable()
    val parentRef = useRef<HTMLElement>()

    val virtualOptions = UseVirtualizerOptions<HTMLElement, Element>(
        count = table.rows.size,
        getScrollElement = parentRef::current,
        estimateSize = { 40 },
        overscan = 5,
    )

    VirtualOptionsContext(virtualOptions) {
        SelectionContext(table.meta.selection) {
            ParentContainer {
                ref = parentRef

                SimpleTable {
                    headerGroups = table.headerGroups
                    rows = table.rows
                }
            }
        }
    }
}

private val ParentContainer = div.styled {
    position = Position.relative
    overflowY = auto

    width = 100.pct
    height = 86.vh
}
