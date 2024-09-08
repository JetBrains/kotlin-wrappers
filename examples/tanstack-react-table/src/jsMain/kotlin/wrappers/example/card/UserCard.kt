package wrappers.example.card

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.span
import web.cssom.*
import web.cssom.Length.Companion.maxContent
import wrappers.example.hooks.useDeleteUser
import wrappers.example.hooks.useUpdateUser
import wrappers.example.selection.useSelectedUser
import wrappers.example.theme.Theme

val UserCard = FC {
    val selectedUser = useSelectedUser()
    val updateUser = useUpdateUser()
    val deleteUser = useDeleteUser()

    div {
        css {
            display = Display.grid
            gridAutoRows = maxContent
            gap = 20.px
        }

        div {
            +"User Information"

            button {
                css {
                    marginLeft = 20.px
                }
                disabled = selectedUser == null
                onClick = { updateUser(selectedUser!!.apply { name += "_Updated" }) }

                +"Update"
            }

            button {
                css {
                    marginLeft = 20.px
                }
                disabled = selectedUser == null
                onClick = { deleteUser(selectedUser!!) }

                +"Delete"
            }
        }

        div {
            css {
                display = Display.grid
                width = 400.px
                borderSpacing = 0.px
                borderCollapse = BorderCollapse.collapse
                whiteSpace = WhiteSpace.nowrap
                borderWidth = 2.px
                borderStyle = LineStyle.solid
                borderColor = Theme.Stroke.Gray
                gap = 10.px
            }

            span {
                +"Name: ${selectedUser?.name ?: "—"}"
            }

            span {
                +"E-mail: ${selectedUser?.email ?: "—"}"
            }

            span {
                +"Phone: ${selectedUser?.phone ?: "—"}"
            }

            span {
                +"Website: ${selectedUser?.website ?: "—"}"
            }
        }
    }
}
