package wrappers.example.components

import emotion.react.css
import js.objects.jso
import react.FC
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.table
import react.dom.html.ReactHTML.tbody
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.th
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import tanstack.react.table.renderCell
import tanstack.react.table.renderHeader
import tanstack.react.table.useReactTable
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader
import tanstack.table.core.getCoreRowModel
import web.cssom.*
import web.cssom.Auto.Companion.auto
import web.cssom.LineStyle.Companion.solid
import web.cssom.None.Companion.none
import wrappers.example.entities.User
import wrappers.example.hooks.useCreateUser
import wrappers.example.hooks.useUsers
import wrappers.example.theme.Theme
import kotlin.random.Random.Default.nextInt

val UserTable = FC {
    val users = useUsers()
    val createUser = useCreateUser()
    val setSelectedUser = useSetSelectedUser()

    val table = useReactTable<User>(
        options = jso {
            data = users
            columns = arrayOf<ColumnDef<User, String>>(
                jso {
                    id = "name"
                    header = StringOrTemplateHeader("Name")
                    accessorFn = { row, _ -> row.name }
                },
                jso {
                    id = "email"
                    header = StringOrTemplateHeader("E-mail")
                    accessorFn = { row, _ -> row.email }
                },
            )
            getCoreRowModel = getCoreRowModel()
        }
    )

    div {
        button {
            onClick = { createUser(jso { id = "${nextInt()}" }) }

            +"Create New"
        }

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
                    color = Theme.Text.Gray
                    fontSize = 18.px
                    backgroundColor = Theme.Background.Gray
                }

                for (headerGroup in table.getHeaderGroups()) {
                    tr {
                        for (header in headerGroup.headers) {
                            th {
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

                for (row in table.getRowModel().rows) {
                    tr {
                        css {
                            fontSize = 16.px
                            cursor = Cursor.pointer
                            borderBottom = Border(1.px, solid, Theme.Stroke.LightGray)
                            hover {
                                backgroundColor = Theme.Background.Gray
                            }
                        }

                        onClick = { setSelectedUser(row.original) }

                        for (cell in row.getVisibleCells()) {
                            td {
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
}
