package wrappers.example.components

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import web.cssom.BorderCollapse
import web.cssom.LineStyle
import web.cssom.WhiteSpace
import web.cssom.px
import wrappers.example.hooks.useDeleteUser
import wrappers.example.hooks.useUpdateUser
import wrappers.example.theme.Theme

val UserPanel = FC {
    val selectedUser = useSelectedUser()
    val updateUser = useUpdateUser()
    val deleteUser = useDeleteUser()

    div {
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
                width = 400.px
                borderSpacing = 0.px
                borderCollapse = BorderCollapse.collapse
                whiteSpace = WhiteSpace.nowrap
                borderWidth = 2.px
                borderStyle = LineStyle.solid
                borderColor = Theme.Stroke.Gray
                marginTop = 20.px
            }

            div {
                +"Name: ${selectedUser?.name ?: "—"}"
            }

            div {
                +"E-mail: ${selectedUser?.email ?: "—"}"
            }

            div {
                +"Phone: ${selectedUser?.phone ?: "—"}"
            }

            div {
                +"Website: ${selectedUser?.website ?: "—"}"
            }
        }
    }
}
