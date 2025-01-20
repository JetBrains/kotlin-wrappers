package wrappers.example.table.selection

import react.RequiredContext
import react.createRequiredContext
import react.useRequired
import wrappers.example.entities.Key

typealias SelectionHandler<T> = (Map<T, Boolean>) -> Unit

internal val SelectionHandlerContext: RequiredContext<SelectionHandler<Key>> =
    createRequiredContext()

internal fun useSelectionHandler(): SelectionHandler<Key> =
    useRequired(SelectionHandlerContext)
