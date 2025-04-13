package karakum.table

internal fun String.applyPatches(): String {
    return let {
        val source = it.substringAfter("\n    meta?: TableMeta<TData>;")
            .substringBefore("\n}")

        val replacement = source
            .replaceFirst(
                "onStateChange: (updater: Updater<TableState>) => void;",
                "onStateChange?: (updater: Updater<TableState>) => void;",
            )
            .replaceFirst(
                "state: Partial<TableState>;",
                "state?: Partial<TableState>;",
            )

        it.replaceFirst(source, replacement) +
                "\n\n" +
                "export interface CoreOptionsResolved<TData extends RowData> extends CoreOptions<TData> {\n" +
                source.splitToSequence("\n")
                    .filter { it.endsWith(";") }
                    .joinToString("\n") +
                "\n}\n"
    }
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
