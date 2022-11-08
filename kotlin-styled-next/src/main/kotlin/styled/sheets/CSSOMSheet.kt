package styled.sheets

import dom.html.HTMLStyleElement
import kotlinx.browser.window
import kotlinx.js.asList
import web.timers.setTimeout
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.collections.set

private typealias Rules = Iterable<String>

internal enum class RemoveMode { OnBrowserIdle, Instantly }

/**
 * A stylesheet that is injected using the CSSOM API.
 * Removes unused styled after [cleanTimeout].
 * Useful in production mode when application have a lot of pages and creates a lot of different css for these pages.
 */
internal class CSSOMSheet(
    val type: RuleType,
    val removeMode: RemoveMode = RemoveMode.OnBrowserIdle,
    private var cleanTimeout: Int = 30000,
    maxRulesPerSheet: Int? = DEFAULT_MAX_RULES_PER_SHEET
) : AbstractSheet(type, maxRulesPerSheet) {
    private val groups = LinkedHashMap<GroupId, RulesGroup>()
    internal val scheduledGroups = LinkedHashMap<GroupId, Rules>()

    private var groupId: Int = 0
        get() = field.also { field++ }

    private var isCleanRequested: Boolean = false

    override fun scheduleToInject(rules: Rules): Int = groupId.also { scheduledGroups[it] = rules }

    fun requestClean(clean: () -> Unit) {
        if (isCleanRequested) return
        isCleanRequested = true
        if (removeMode == RemoveMode.Instantly) {
            isCleanRequested = false
            clean()
            return
        }
        setTimeout({
            val idleCallback = window.asDynamic().requestIdleCallback
            if (idleCallback != undefined && removeMode == RemoveMode.OnBrowserIdle) {
                idleCallback {
                    isCleanRequested = false
                    clean()
                }
            } else {
                isCleanRequested = false
                clean()
            }
        }, cleanTimeout)
    }

    fun removeGroups(groupIds: List<GroupId>) {
        for (groupId in groupIds) {
            if (groupId in scheduledGroups) {
                scheduledGroups.remove(groupId)
                continue
            }

            val removedGroup = groups.remove(groupId) ?: throw IllegalArgumentException("Group $groupId does not exist")

            if (!removedGroup.rulesRange.isEmpty()) {
                val sheet = removedGroup.element.cssSheet
                removedGroup.rulesRange.reversed().forEach {
                    sheet.deleteRule(it)
                }

                if (sheet.cssRules.length == 0) {
                    removedGroup.element.removeAndCleanUp()
                }
            }

            val rulesShift = removedGroup.rulesRange.last - removedGroup.rulesRange.first + 1

            for (entry in groups) {
                val (otherGroupId, otherGroup) = entry
                if (otherGroup.element == removedGroup.element && otherGroupId > groupId) {
                    val otherRange = otherGroup.rulesRange
                    val shiftedRange = (otherRange.first - rulesShift)..(otherRange.last - rulesShift)
                    entry.setValue(otherGroup.copy(rulesRange = shiftedRange))
                }
            }
        }

        compressSheets()
    }

    override fun injectScheduled() {
        if (scheduledGroups.isNotEmpty()) {
            for ((groupId, rules) in scheduledGroups) {
                val element = getCurrentStyleElement(rules.count())
                val ruleStart = element.cssSheet.cssRules.length
                var ruleId = ruleStart
                for (rule in rules) {
                    try {
                        element.cssSheet.insertRule(rule, ruleId)
                        ruleId++
                    } catch (e: Throwable) {
                        /* Browser does not support the rule */
                    }
                }
                groups[groupId] = RulesGroup(element, ruleStart until ruleId)
            }
            scheduledGroups.clear()
        }
    }

    /**
     * Combines successive style sheets with less than [maxRulesPerSheet] rules in total into one style sheet.
     * It preserves rules order and updates group mapping.
     */
    private fun compressSheets() {
        val maxRulesPerSheet = maxRulesPerSheet ?: return

        // Find successive groups of style elements that can be combined
        val elementGroups = mutableListOf<List<HTMLStyleElement>>()
        var currentMergeGroup = mutableListOf<HTMLStyleElement>()
        var totalRulesCount = 0
        for (element in usedStyleElements) {
            val rulesLength = element.cssSheet.cssRules.length
            if (rulesLength + totalRulesCount > maxRulesPerSheet) {
                if (currentMergeGroup.size > 1) {
                    elementGroups += currentMergeGroup
                }
                totalRulesCount = 0
                currentMergeGroup = mutableListOf()
            }
            totalRulesCount += rulesLength
            currentMergeGroup.add(element)
        }
        if (currentMergeGroup.size > 1) {
            elementGroups += currentMergeGroup
        }

        class RulesGroupUpdate(val element: HTMLStyleElement, val shift: Int)

        // Move all rules in a group to the first style element and delete other elements.
        val groupUpdates = mutableMapOf<HTMLStyleElement, RulesGroupUpdate>()
        elementGroups.forEach { elements ->
            val reused = elements.first()
            elements.drop(1).forEach { mergedSheet ->
                groupUpdates[mergedSheet] = RulesGroupUpdate(reused, reused.cssSheet.cssRules.length)
                mergedSheet.cssSheet.cssRules.asList().forEach {
                    reused.cssSheet.insertRule(it.cssText, reused.cssSheet.cssRules.length)
                }
                mergedSheet.removeAndCleanUp()
            }
        }

        // Update ranges of moved rules
        for (entry in groups) {
            val otherGroup = entry.value
            groupUpdates[otherGroup.element]?.let {
                val otherRange = otherGroup.rulesRange
                val shiftedRange = (otherRange.first + it.shift)..(otherRange.last + it.shift)
                entry.setValue(RulesGroup(element = it.element, rulesRange = shiftedRange))
            }
        }
    }

    override fun clear() {
        super.clear()
        groups.clear()
        scheduledGroups.clear()
    }

    private data class RulesGroup(val element: HTMLStyleElement, val rulesRange: IntRange)
}
