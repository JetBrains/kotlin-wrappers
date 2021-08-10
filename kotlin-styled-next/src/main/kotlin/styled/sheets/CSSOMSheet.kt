package styled.sheets

import org.w3c.dom.css.CSSStyleSheet

typealias GroupId = Int

internal data class InjectedInfo(var usedBy: Int, var range: IntRange)
internal data class ScheduledInfo(var usedBy: Int, val rules: Iterable<String>)

internal class CSSOMSheet : AbstractSheet() {
    private var groupSerial = 0
    internal val sheet by lazy { appendStyleElement(styleId).sheet as CSSStyleSheet }
    internal val importsSheet by lazy { appendStyleElement("$importStyleId").sheet as CSSStyleSheet }
    internal val groups = LinkedHashMap<GroupId, InjectedInfo>()
    internal val scheduledRules = LinkedHashMap<GroupId, ScheduledInfo>()
    internal val scheduledImportRules = mutableListOf<String>()

    override fun scheduleToInject(rules: Iterable<String>, type: RuleType): GroupId {
        return when (type) {
            RuleType.REGULAR -> {
                scheduledRules[groupSerial] = ScheduledInfo(1, rules)
                groupSerial.also { groupSerial++ }
            }
            RuleType.IMPORT -> {
                scheduledImportRules.addAll(rules)
                return 0
            }
        }
    }

    override fun injectScheduled() {
        for ((groupId, scheduledInfo) in scheduledRules) {
            val (usedBy, group) = scheduledInfo
            if (usedBy <= 0) continue

            val range = inject(sheet, group.filter { it.isNotEmpty() }.toMutableList())
            groups[groupId] = InjectedInfo(usedBy, range)
        }
        scheduledRules.clear()
        inject(importsSheet, scheduledImportRules)
    }

    override fun removeRules(removedGroupId: Int): Boolean {
        val injectedInfo = groups[removedGroupId]
        if (injectedInfo == null) {
            val scheduledInfo = scheduledRules[removedGroupId] ?: throw IllegalStateException("Group $removedGroupId to remove does not exist")
            scheduledInfo.usedBy--
            if ((scheduledInfo.usedBy) <= 0) {
                scheduledRules.remove(removedGroupId)
                return true
            }
            return false
        }

        injectedInfo.usedBy--
        if (injectedInfo.usedBy > 0) return false

        for (i in injectedInfo.range) {
            sheet.deleteRule(i)
        }
        val size = injectedInfo.range.last - injectedInfo.range.first + 1
        for ((groupId, info) in groups) {
            if (groupId > removedGroupId) {
                info.move(size)
            }
        }
        groups.remove(removedGroupId)
        return true
    }

    private fun InjectedInfo.move(size: Int) {
        range -= size
    }

    override fun useCss(groupId: Int) {
        val group = groups[groupId]
        if (group == null) {
            val scheduledInfo = scheduledRules[groupId] ?: throw IllegalStateException("Used group $groupId does not exist")
            scheduledInfo.usedBy++
        } else {
            group.usedBy++
        }
    }

    private operator fun IntRange.minus(value: Int): IntRange {
        return (first - value)..(last - value)
    }
}