package example.card

import emotion.react.css
import example.hooks.useDeleteUser
import example.hooks.useUpdateUser
import example.selection.useSelectedUser
import example.theme.Theme
import react.FC
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.span
import web.cssom.*
import web.cssom.Length.Companion.maxContent

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
                onClick = {
                    val user = selectedUser!!
                    updateUser(user.copy(user.name + "_Updated"))
                }

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
