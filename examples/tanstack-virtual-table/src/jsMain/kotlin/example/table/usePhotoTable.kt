package wrappers.example.table

import js.array.ReadonlyArray
import js.objects.jso
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader
import wrappers.example.entities.Photo
import wrappers.example.hooks.usePhotos
import wrappers.example.table.selection.createSelectionColumn
import wrappers.example.table.simple.TableInstance
import wrappers.example.table.simple.useSimpleTable

private val COLUMNS: ReadonlyArray<ColumnDef<Photo, String>> = arrayOf(
    createSelectionColumn(),
    jso {
        id = "title"
        header = StringOrTemplateHeader("Title")
        accessorFn = { user, _ -> user.title }
    },
    jso {
        id = "url"
        header = StringOrTemplateHeader("Url")
        accessorFn = { user, _ -> user.url }
    },
    jso {
        id = "thumbnail"
        header = StringOrTemplateHeader("Thumbnail")
        accessorFn = { user, _ -> user.thumbnailUrl }
    },
)

internal fun usePhotoTable(): TableInstance<Photo> {
    val users = usePhotos()
    val tableMeta = useTableMeta()

    val table = useSimpleTable(
        data = users,
        columns = COLUMNS,
        meta = tableMeta,
    )

    return table
}
