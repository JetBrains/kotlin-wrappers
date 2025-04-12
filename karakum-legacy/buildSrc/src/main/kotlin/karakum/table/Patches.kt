package karakum.table

internal fun String.applyPatches(): String {
    return replace(
        "\n    meta?: TableMeta<TData>;",
        "\n    meta?: TableMeta<TData>;" +
                "\n}" +
                "\n\n" +
                "export interface CoreOptionsResolved<TData extends RowData> extends CoreOptions<TData> {",
    )
        .let {
            val replacement = it
                .substringAfter("TableOptionsResolved<TData extends RowData> extends ")
                .substringBefore(" {\n")

            it.replaceFirst(
                "PartialKeys<TableOptionsResolved<TData>, 'state' | 'onStateChange' | 'renderFallbackValue'>",
                replacement,
            )
        }
        .replace(
            "TableOptionsResolved<TData extends RowData> extends CoreOptions<TData>",
            "TableOptionsResolved<TData extends RowData> extends CoreOptionsResolved<TData>",
        )
}
