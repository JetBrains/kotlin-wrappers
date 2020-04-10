package kotlinx.css

import kotlin.test.*

class TestGrid {
    @Test
    fun testGridAutoColumns() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns("10fr 1fr 200px")
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: 10fr 1fr 200px;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoColumns_dims() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns(10.fr, 1.fr, 200.px)
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: 10fr 1fr 200px;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoColumns_auto() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.auto
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: auto;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoColumns_fitContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.fitContent(GridAutoColumns.minMax(10.px, 20.px))
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: min-max(auto, max(auto, min-max(10px, 20px)));

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoColumns_maxContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.maxContent
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: max-content;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoColumns_minContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.minContent
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: min-content;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoColumns_minMax1() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.minMax(10.fr, 20.fr)
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: min-max(10fr, 20fr);

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoColumns_minMax2() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoColumns = GridAutoColumns.minMax(GridAutoColumns.auto, GridAutoColumns(10.fr))
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-columns: min-max(auto, 10fr);

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_initial() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.initial
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: initial;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_inherit() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.inherit
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: inherit;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_unset() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.unset
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: unset;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_column() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.column
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: column;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_columnDense() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.columnDense
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: column dense;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_dense() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.dense
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: dense;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_row() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.row
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: row;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testAutoFlow_rowDense() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoFlow = GridAutoFlow.rowDense
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-flow: row dense;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows("10fr 1fr 200px")
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: 10fr 1fr 200px;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows_dims() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows(10.fr, 1.fr, 200.px)
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: 10fr 1fr 200px;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows_auto() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.auto
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: auto;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows_fitContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.fitContent(GridAutoRows.minMax(10.px, 20.px))
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: min-max(auto, max(auto, min-max(10px, 20px)));

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows_maxContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.maxContent
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: max-content;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows_minContent() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.minContent
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: min-content;

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows_minMax1() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.minMax(10.fr, 20.fr)
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: min-max(10fr, 20fr);

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridAutoRows_minMax2() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridAutoRows = GridAutoRows.minMax(GridAutoRows.auto, GridAutoRows(10.fr))
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-auto-rows: min-max(auto, 10fr);

            """.trimIndent(), cssBuilder.toString()
        )
    }

    @Test
    fun testGridTemplateRows_repeat() {
        val cssBuilder = CSSBuilder()

        ruleSet {
            gridTemplateRows = GridTemplateRows.repeat("auto-fill")
        }.invoke(cssBuilder)

        asserter.assertEquals(
            "Unexpected generated CSS block", """
            grid-template-rows: repeat(auto-fill);

            """.trimIndent(), cssBuilder.toString()
        )
    }
}
