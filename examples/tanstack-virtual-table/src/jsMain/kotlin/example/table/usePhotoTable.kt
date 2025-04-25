package example.table

import example.entities.Photo
import example.hooks.usePhotos
import example.table.selection.createSelectionColumn
import example.table.simple.RowIdFn
import example.table.simple.TableInstance
import example.table.simple.TableSettings
import example.table.simple.useSimpleTable
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

private val GET_ROW_ID: RowIdFn<Photo> = { row, _, _ ->
    "row-${row.id}"
}

internal fun usePhotoTable(): TableInstance<Photo> {
    val users = usePhotos()
    val tableMeta = useTableMeta()

    val table = useSimpleTable(
        data = users,
        columns = COLUMNS,
        meta = tableMeta,
        settings = TableSettings(
            getRowId = GET_ROW_ID,
        )
    )

    return table
}
