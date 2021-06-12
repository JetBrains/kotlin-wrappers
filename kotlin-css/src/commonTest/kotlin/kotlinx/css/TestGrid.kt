package kotlinx.css

import kotlin.test.*

class TestGrid {
    @Test
    fun testGridAutoColumns() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns("10fr 1fr 200px")
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: 10fr 1fr 200px;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoColumns_dims() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns(10.fr, 1.fr, 200.px)
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: 10fr 1fr 200px;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoColumns_auto() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.auto
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: auto;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoColumns_fitContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.fitContent(GridAutoColumns.minMax(10.px, 20.px))
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: minmax(auto, max(auto, minmax(10px, 20px)));
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoColumns_maxContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.maxContent
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: max-content;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoColumns_minContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.minContent
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: min-content;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoColumns_minMax1() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.minMax(10.fr, 20.fr)
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: minmax(10fr, 20fr);
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoColumns_minMax2() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.minMax(GridAutoColumns.auto, GridAutoColumns(10.fr))
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-columns: minmax(auto, 10fr);
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_initial() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.initial
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: initial;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_inherit() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.inherit
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: inherit;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_unset() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.unset
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: unset;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_column() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.column
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: column;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_columnDense() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.columnDense
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: column dense;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_dense() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.dense
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: dense;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_row() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.row
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: row;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testAutoFlow_rowDense() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.rowDense
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-flow: row dense;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows("10fr 1fr 200px")
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: 10fr 1fr 200px;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows_dims() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows(10.fr, 1.fr, 200.px)
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: 10fr 1fr 200px;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows_auto() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.auto
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: auto;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows_fitContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.fitContent(GridAutoRows.minMax(10.px, 20.px))
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: minmax(auto, max(auto, minmax(10px, 20px)));
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows_maxContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.maxContent
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: max-content;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows_minContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.minContent
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: min-content;
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows_minMax1() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.minMax(10.fr, 20.fr)
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: minmax(10fr, 20fr);
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridAutoRows_minMax2() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.minMax(GridAutoRows.auto, GridAutoRows(10.fr))
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-auto-rows: minmax(auto, 10fr);
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }

    @Test
    fun testGridTemplateRows_repeat() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridTemplateRows = GridTemplateRows.repeat("auto-fill")
        }.invoke(cssBuilder)

        assertEquals(
            """
                grid-template-rows: repeat(auto-fill);
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }
}
