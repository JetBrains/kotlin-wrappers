package wrappers.example.table.selection

import react.RequiredContext
import react.createRequiredContext
import react.useRequired

internal val SelectionContext: RequiredContext<Selection> =
    createRequiredContext()

internal fun useSelection(): Selection =
    useRequired(SelectionContext)
