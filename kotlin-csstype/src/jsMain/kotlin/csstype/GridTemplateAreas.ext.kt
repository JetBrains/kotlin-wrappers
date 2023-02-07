package csstype

import js.core.ReadonlyArray

fun GridTemplateAreas(
    vararg values: Ident,
): GridTemplateAreas =
    values.joinToString("\n") { "'$it'" }
        .unsafeCast<GridTemplateAreas>()

fun GridTemplateAreas(
    vararg values: ReadonlyArray<Ident>,
): GridTemplateAreas =
    values.joinToString("\n") {
        "'${it.joinToString(" ")}'"
    }.unsafeCast<GridTemplateAreas>()
