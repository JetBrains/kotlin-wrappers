package csstype

fun GridTemplateRows(
    vararg values: GridTemplateRows,
): GridTemplateRows =
    values.joinToString(" ")
        .unsafeCast<GridTemplateRows>()
