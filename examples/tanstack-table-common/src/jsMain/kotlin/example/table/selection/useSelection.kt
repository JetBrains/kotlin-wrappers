package example.table.selection

import react.RequiredContext
import react.createRequiredContext
import react.useRequired

val SelectionContext: RequiredContext<Selection> =
    createRequiredContext()

fun useSelection(): Selection =
    useRequired(SelectionContext)
