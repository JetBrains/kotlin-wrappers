package benchmark

import StyledElementsFactory.getStyledComponent
import TestScope
import styled.GlobalStyles
import styled.StyledCss
import waitForAnimationFrame
import kotlin.test.Test
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

/**
 * [LinkedHashMap] implementation which holds total duration of all [get] and [put] operations
 */
@OptIn(ExperimentalTime::class)
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

@OptIn(ExperimentalTime::class)
class AddStyledElements : BenchmarkBase() {
    /**
     * Measure time to inject [n] styled components into the DOM
     * @return duration of all injects
     */
    private suspend fun TestScope.addNElements(n: Int): Duration {
        assertChildrenCount(0)

        val component = getStyledComponent(n)
        val cssHolder = TimedLinkedHashMap<StyledCss, String>()
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