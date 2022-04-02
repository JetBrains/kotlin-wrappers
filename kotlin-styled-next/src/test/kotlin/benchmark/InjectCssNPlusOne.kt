package benchmark

import TestScope
import addCss
import kotlinx.browser.window
import kotlinx.css.CssBuilder
import kotlinx.css.height
import kotlinx.css.px
import kotlinx.css.width
import react.Props
import react.fc
import styled.GlobalStyles
import styled.css
import styled.sheets.CSSOMSheet
import styled.sheets.RemoveMode
import styled.sheets.RuleType
import styled.styledDiv
import waitForAnimationFrame
import kotlin.random.Random
import kotlin.test.Test
import kotlin.time.Duration
import kotlin.time.measureTime

class InjectCssNPlusOne : BenchmarkBase() {

    private suspend fun TestScope.preloadElements(n: Int) {
        val component = fc<Props> {
            val random = Random(152)
            (1..n).forEach {
                styledDiv {
                    css {
                        height = 100.px
                        width = 100.px
                    }

                    addCss(it, random)
                }
            }
        }
        getRootInfo().renderComponent(component)
        waitForAnimationFrame()

        assertChildrenCount(n)
        assertCssNotEmpty()
    }

    /**
     * Measure performance of style recalculation caused by CSS injection.
     * This metric becomes more important for pages with big and complex DOM and CSSOM.
     */
    private fun TestScope.injectRulesOneByOne(): Duration {
        val duration = measureTime {
            repeat(100) {
                GlobalStyles.scheduleToInject(".dummy_rule$it", CssBuilder().apply {
                    height = 0.px
                })
                GlobalStyles.injectScheduled()
                window.document.body!!.scrollTop += 1
            }
        }
        clear()
        return duration
    }

    private fun disableSheetPartitioning() {
        GlobalStyles.sheet = CSSOMSheet(RuleType.REGULAR, RemoveMode.Instantly, maxRulesPerSheet = null)
    }

    @Test
    fun injectRulesOneByOne500Elements() = runBenchmark("injectRulesOneByOne500Elements") {
        preloadElements(500)

        injectRulesOneByOne()
    }

    @Test
    fun injectRulesOneByOne1000Elements() = runBenchmark("injectRulesOneByOne1000Elements") {
        preloadElements(1000)

        injectRulesOneByOne()
    }

    @Test
    fun injectRulesOneByOne2000Elements() = runBenchmark("injectRulesOneByOne2000Elements") {
        preloadElements(2000)

        injectRulesOneByOne()
    }

    @Test
    fun injectRulesOneByOne500Elements_partitioningDisabled() =
        runBenchmark("injectRulesOneByOne500Elements_partitioningDisabled") {
            disableSheetPartitioning()
            preloadElements(500)

            injectRulesOneByOne()
        }

    @Test
    fun injectRulesOneByOne1000Elements_partitioningDisabled() =
        runBenchmark("injectRulesOneByOne1000Elements_partitioningDisabled") {
            disableSheetPartitioning()
            preloadElements(1000)

            injectRulesOneByOne()
        }

    @Test
    fun injectRulesOneByOne2000Elements_partitioningDisabled() =
        runBenchmark("injectRulesOneByOne2000Elements_partitioningDisabled") {
            disableSheetPartitioning()
            preloadElements(2000)

            injectRulesOneByOne()
        }
}
