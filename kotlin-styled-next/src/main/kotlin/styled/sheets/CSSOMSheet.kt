package styled.sheets

import kotlinx.browser.window
import org.w3c.dom.css.CSSStyleSheet

private typealias Rules = Iterable<String>

internal enum class RemoveMode { OnBrowserIdle, AfterTimeout, Instantly }

/**
 * A stylesheet that is injected using the CSSOM API.
 * Removes unused styled after [cleanTimeout].
 * Useful in production mode when application have a lot of pages and creates a lot of different css for these pages.
 */
internal class CSSOMSheet(
    val type: RuleType,
    val removeMode: RemoveMode = RemoveMode.OnBrowserIdle,
    var cleanTimeout: Int = 30000
) : AbstractSheet(type) {
    internal val sheet by lazy { appendStyleElement().sheet as CSSStyleSheet }

    internal val groups = LinkedHashMap<GroupId, IntRange>()
    internal val scheduledGroups = LinkedHashMap<GroupId, Rules>()

    private var groupId: Int = 0
        get() = field.also { field++ }

    internal var isCleanRequested: Boolean = false

    override fun scheduleToInject(rules: Rules): Int = groupId.also { scheduledGroups[it] = rules }

    fun requestClean(clean: () -> Unit) {
        if (isCleanRequested) return
        isCleanRequested = true
        if (removeMode == RemoveMode.Instantly) {
            isCleanRequested = false
            clean()
            return
        }
        window.setTimeout({
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

            val rmGroup = this.groups[groupId] ?: throw IllegalArgumentException("Group $groupId does not exist")
            groups.remove(groupId)
            for (i in rmGroup.reversed()) {
                sheet.deleteRule(i)
            }

            val size = rmGroup.last - rmGroup.first + 1
            for (group in this.groups) {
                if (group.key > groupId) {
                    group.setValue((group.value.first - size)..(group.value.last - size))
                }
            }
        }
    }

    override fun injectScheduled() {
        var ruleId = sheet.cssRules.length
        for ((groupId, rules) in scheduledGroups) {
            val ruleStart = ruleId
            for (rule in rules) {
                try {
                    sheet.insertRule(rule, ruleId)
                    ruleId++
                } catch (e: Throwable) {
                    /* Browser does not support the rule */
                }
            }
            groups[groupId] = ruleStart until ruleId
        }
        scheduledGroups.clear()
    }

    override fun clear() {
        groups.clear()
        scheduledGroups.clear()
    }
}
