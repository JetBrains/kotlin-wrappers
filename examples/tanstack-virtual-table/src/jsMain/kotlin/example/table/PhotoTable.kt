package example.table

import emotion.styled.styled
import example.entities.Photo
import example.table.base.TableBase
import example.table.base.TableBaseProps
import example.table.selection.SelectionContext
import example.table.selection.selection
import example.theme.Theme
import react.FC
import react.dom.html.ReactHTML.tbody
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.th
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import web.cssom.*
import web.cssom.Auto.Companion.auto
import web.cssom.LineStyle.Companion.solid

internal val PhotoTable = FC {
    val table = usePhotoTable()

    SelectionContext(table.meta.selection) {
        Table<TableBaseProps<Photo>> {
            headerGroups = table.headerGroups
            rows = table.rows
        }
    }
}

private val Table = TableBase.styled {
    width = 400.px
    borderSpacing = 0.px
    borderCollapse = BorderCollapse.collapse
    whiteSpace = WhiteSpace.nowrap
    border = Border(2.px, solid, Theme.Stroke.Gray)
    margin = auto

    thead {
        fontSize = 18.px
        color = Theme.Text.Gray
        backgroundColor = Theme.Background.Gray

        tr {
            th {
                fontWeight = FontWeight.normal
                padding = Padding(4.px, 12.px)
                borderRight = Border(1.px, solid, Theme.Stroke.Gray)
                borderBottom = Border(1.px, solid, Theme.Stroke.Gray)

                lastChild {
                    borderRight = None.Companion.none
                }
            }
        }
    }

    tbody {
        color = Theme.Text.Black
        backgroundColor = Theme.Background.White
        textAlign = TextAlign.start

        tr {
            fontSize = 16.px
            cursor = Cursor.pointer
            borderBottom = Border(1.px, solid, Theme.Stroke.LightGray)

            hover {
                backgroundColor = Theme.Background.Gray
            }

            td {
                padding = Padding(10.px, 12.px)
            }
        }
    }
}
