package example.table.base

import js.array.ReadonlyArray
import react.FC
import react.PropsWithValue
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import tanstack.table.core.HeaderGroup

internal external interface TableHeadProps : PropsWithValue<ReadonlyArray<HeaderGroup<*>>>

internal val TableHead: FC<TableHeadProps> = FC { props ->
    val headerGroups = props.value

    thead {
        for (headerGroup in headerGroups) {
            tr {
                key = headerGroup.id

                for (header in headerGroup.headers) {
                    TableHeader {
                        key = header.id
                        value = header
                    }
                }
            }
        }
    }
}
