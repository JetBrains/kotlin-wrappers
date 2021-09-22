package csstype

fun Properties.gridTemplateColumns(
    vararg values: GridTemplateColumns,
) {
    gridTemplateColumns = values
        .joinToString(" ")
        .unsafeCast<GridTemplateColumns>()
}
