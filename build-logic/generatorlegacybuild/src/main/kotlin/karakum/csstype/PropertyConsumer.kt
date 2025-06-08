package karakum.csstype

import karakum.common.ConversionResult

internal class PropertyConsumer : ParentConsumer {
    override fun apply(
        items: List<ConversionResult>,
    ): List<ConversionResult> {
        val typeMap = sequenceOf(
            AUTO_TYPE,
            NONE_TYPE,
            COLOR_TYPE,
            GRID_LINE_PROPERTY,
            LINE_STYLE_PROPERTY,
            LINE_WIDTH_PROPERTY,
            BLEND_MODE_PROPERTY,

            "GlobalsType"
        ).associateBy {
            it.removeSuffix("Property")
                .removeSuffix("Type")
        }

        val oldTypes = items.filter { typeMap.containsKey(it.name) }
        val newTypes = oldTypes.map { source ->
            val type = source.name
            val parentType = typeMap.getValue(type)
            val newBody = if ("constructor()" in source.body) {
                source.body.replaceFirst("constructor()", "constructor(): $parentType")
            } else {
                source.body.replaceFirst(" $type", " $type: $parentType")
            }
            source.copy(body = newBody)
        }

        return items - oldTypes + newTypes
    }
}
