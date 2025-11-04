package example.table.simple

import emotion.react.css
import example.table.base.TableInstance
import example.theme.Theme
import react.ChildrenBuilder
import react.FC
import react.Key
import react.PropsWithValue
import react.dom.html.ReactHTML.table
import react.dom.html.ReactHTML.tbody
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.th
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import tanstack.react.table.renderCell
import tanstack.react.table.renderHeader
import web.cssom.*
import web.cssom.Auto.Companion.auto
import web.cssom.LineStyle.Companion.solid
import web.cssom.None.Companion.none

internal external interface SimpleTableProps<D : Any> : PropsWithValue<TableInstance<D>> {
    var onRowClick: (value: D) -> Unit
}

internal val SimpleTable: FC<SimpleTableProps<*>> = FC { props ->
    SimpleTable(props)
}

private fun <D : Any> ChildrenBuilder.SimpleTable(props: SimpleTableProps<D>) {
    val table = props.value

    table {
        css {
            width = 400.px
            borderSpacing = 0.px
            borderCollapse = BorderCollapse.collapse
            whiteSpace = WhiteSpace.nowrap
            border = Border(2.px, solid, Theme.Stroke.Gray)
            margin = auto
        }

        thead {
            css {
                fontSize = 18.px
                color = Theme.Text.Gray
                backgroundColor = Theme.Background.Gray
            }

            for (headerGroup in table.headerGroups) {
                tr {
                    key = Key(headerGroup.id)

                    for (header in headerGroup.headers) {
                        th {
                            key = Key(header.id)

                            css {
                                fontWeight = FontWeight.normal
                                padding = Padding(4.px, 12.px)
                                borderRight = Border(1.px, solid, Theme.Stroke.Gray)
                                borderBottom = Border(1.px, solid, Theme.Stroke.Gray)

                                lastChild {
                                    borderRight = none
                                }
                            }

                            +renderHeader(header)
                        }
                    }
                }
            }
        }

        tbody {
            css {
                color = Theme.Text.Black
                backgroundColor = Theme.Background.White
                textAlign = TextAlign.start
            }

            for (row in table.rows) {
                tr {
                    key = Key(row.id)

                    css {
                        fontSize = 16.px
                        cursor = Cursor.pointer
                        borderBottom = Border(1.px, solid, Theme.Stroke.LightGray)

                        hover {
                            backgroundColor = Theme.Background.Gray
                        }
                    }

                    onClick = {
                        props.onRowClick(row.original)
                    }

                    for (cell in row.getVisibleCells()) {
                        td {
                            key = Key(cell.id)

                            css {
                                padding = Padding(10.px, 12.px)
                            }

                            +renderCell(cell)
                        }
                    }
                }
            }
        }
    }
}
