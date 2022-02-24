package benchmark

import StyledElementsFactory.getStyledComponent
import TestScope
import kotlinx.css.CssBuilder
import styled.GlobalStyles
import styled.UsedCssInfo
import waitForAnimationFrame
import kotlin.test.Test
import kotlin.time.Duration
import kotlin.time.measureTime

class AddStyledElements : BenchmarkBase() {
    /**
     * [LinkedHashMap] implementation which holds total duration of all [get] and [put] operations
     */
    private class TimedLinkedHashMap<K, V> : LinkedHashMap<K, V>() {
        var getOperationsDuration: Duration = Duration.ZERO
        var putOperationsDuration: Duration = Duration.ZERO
        override operator fun get(key: K): V? {
            var ret: V?
            getOperationsDuration += measureTime {
                ret = super.get(key)
            }
            return ret
        }

        override fun put(key: K, value: V): V? {
            var ret: V?
            putOperationsDuration += measureTime {
                ret = super.put(key, value)
            }
            return ret
        }
    }

    /**
     * Measure the time elapsed to inject [n] styled components into the DOM
     * @return duration of all injects
     */
    private suspend fun TestScope.addNElements(n: Int): Duration {
        val component = getStyledComponent(n)
        val cssHolder = TimedLinkedHashMap<CssBuilder, UsedCssInfo>()
        GlobalStyles.styledClasses = cssHolder
        val duration = measureTime {
            renderComponent(component)
            waitForAnimationFrame()
        }

        additionalMeasurements.getOrPut("putToDataStructure") {
            mutableListOf()
        }.add(cssHolder.putOperationsDuration)
        additionalMeasurements.getOrPut("getFromDataStructure") {
            mutableListOf()
        }.add(cssHolder.getOperationsDuration)

        assertChildrenCount(n)
        assertCssNotEmpty()

        clear()
        return duration
    }

    @Test
    fun add100Elements() = runBenchmark("add100Elements") {
        addNElements(100)
    }

    @Test
    fun add200Elements() = runBenchmark("add200Elements") {
        addNElements(200)
    }

    @Test
    fun add500Elements() = runBenchmark("add500Elements") {
        addNElements(500)
    }

    @Test
    fun add1000Elements() = runBenchmark(name = "add1000Elements") {
        addNElements(1000)
    }

    @Test
    fun add5000Elements() = runBenchmark(name = "add5000Elements") {
        addNElements(5000)
    }

    @Test
    fun add10000Elements() = runBenchmark(name = "add10000Elements") {
        addNElements(10000)
    }
}
