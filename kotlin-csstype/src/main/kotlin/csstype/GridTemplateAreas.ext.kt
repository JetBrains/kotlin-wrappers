package csstype

import kotlinx.js.ReadonlyArray

fun GridTemplateAreas(
    vararg values: GridArea,
): GridTemplateAreas =
    values.joinToString("\n") { "'$it'" }
        .unsafeCast<GridTemplateAreas>()

fun GridTemplateAreas(
    vararg values: ReadonlyArray<GridArea>,
): GridTemplateAreas =
    values.joinToString("\n") {
        "'${it.joinToString(" ")}'"
    }.unsafeCast<GridTemplateAreas>()
