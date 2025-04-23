package wrappers.example.table.simple

import js.array.ReadonlyArray
import react.useMemo
import tanstack.virtual.core.VirtualItem

internal fun useRowStyles(
    virtualItems: ReadonlyArray<VirtualItem>,
    containerHeight: Int,
): String? {
    val virtualOptions = useVirtualOptionsOrNull()

    return useMemo(virtualItems, containerHeight) {
        virtualOptions ?: return@useMemo null

        val containerStyles = """
            .${CONTAINER_CLASS_NAME} {
                height: ${containerHeight}px;
            }
        """.trimIndent()

        val rowStyles = virtualItems.joinToString("\n") {
            """
                .${ROW_CLASS_NAME(it.key)} {
                    position: absolute;
                    transform: translateY(${it.start}px);
                }
            """.trimIndent()
        }

        """
            $containerStyles
            $rowStyles
        """.trimIndent()
    }
}
