package example.table

import example.components.table.base.TableInstance
import example.components.table.base.useTable
import example.components.table.selection.createSelectionColumn
import example.entities.Photo
import example.hooks.usePhotos
import js.array.ReadonlyArray
import js.objects.unsafeJso
import tanstack.table.core.ColumnDef
import tanstack.table.core.StringOrTemplateHeader

private val COLUMNS: ReadonlyArray<ColumnDef<Photo, String>> = arrayOf(
    createSelectionColumn(),
    unsafeJso {
        id = "title"
        header = StringOrTemplateHeader("Title")
        accessorFn = { user, _ -> user.title }
    },
    unsafeJso {
        id = "url"
        header = StringOrTemplateHeader("Url")
        accessorFn = { user, _ -> user.url }
    },
    unsafeJso {
        id = "thumbnail"
        header = StringOrTemplateHeader("Thumbnail")
        accessorFn = { user, _ -> user.thumbnailUrl }
    },
)

internal fun usePhotoTable(): TableInstance<Photo> {
    val users = usePhotos()
    val tableMeta = useTableMeta()

    val table = useTable(
        data = users,
        columns = COLUMNS,
        meta = tableMeta,
    )

    return table
}
