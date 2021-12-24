package csstype

fun GridTemplateColumns(
    vararg values: GridTemplateColumns,
): GridTemplateColumns =
    values.joinToString(" ")
        .unsafeCast<GridTemplateColumns>()
