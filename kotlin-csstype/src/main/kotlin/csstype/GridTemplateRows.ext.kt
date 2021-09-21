package csstype

fun Properties.gridTemplateRows(
    vararg values: GridTemplateRows,
) {
    gridTemplateRows = values
        .joinToString(" ")
        .unsafeCast<GridTemplateRows>()
}
