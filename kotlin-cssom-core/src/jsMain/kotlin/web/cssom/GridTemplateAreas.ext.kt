package web.cssom

import js.array.ReadonlyArray
import js.reflect.unsafeCast

fun GridTemplateAreas(
    vararg values: Ident,
): GridTemplateAreas =
    unsafeCast(values.joinToString("\n") { "'$it'" })

fun GridTemplateAreas(
    vararg values: ReadonlyArray<Ident>,
): GridTemplateAreas =
    unsafeCast(
        values.joinToString("\n") {
            "'${it.joinToString(" ")}'"
        }
    )
