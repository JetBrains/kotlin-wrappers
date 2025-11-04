package karakum.cesium

import java.io.File

private val RECORD = Regex("""\{\n\s+\[key\:\sstring\]\:\s(\w+)\;\n\s+\}""")

private const val TS_FUNCTION = "(...params: any[]) => any"

internal const val LIGHT: String = "Light"
internal const val SPLINE: String = "Spline"
internal const val TERRAIN_DATA: String = "TerrainData"
internal const val TERRAIN_PROVIDER: String = "TerrainProvider"
internal const val TILING_SCHEME: String = "TilingScheme"
internal const val VISUALIZER: String = "Visualizer"

internal const val PROPERTY: String = "Property"
internal const val MATERIAL_PROPERTY: String = "MaterialProperty"
internal const val POSITION_PROPERTY: String = "PositionProperty"

private val FACTORY_MAP = mapOf(
    Function.PREFIX to ::Function,
    Enum.PREFIX to ::Enum,
    Enum.CONST_PREFIX to ::Enum,
    TopType.PREFIX to ::TopType,
    "interface " to ::Interface,
    Interface.PREFIX to ::Interface,
    Class.PREFIX to ::Class,
    "namespace " to ::Namespace,
    Namespace.PREFIX to ::Namespace
)

internal fun parseDeclarations(
    definitionsFile: File,
): List<Declaration> {
    val declarations = readDeclarations(definitionsFile)
        .toMutableList()

    val classMap = declarations.asSequence()
        .filterIsInstance<Class>()
        .associateBy { it.name }

    if (definitionsFile.parentFile.name == "engine") {
        addParentType(classMap, LIGHT)
        addParentType(classMap, TERRAIN_DATA)
        addParentType(classMap, TERRAIN_PROVIDER)
        addParentType(classMap, TILING_SCHEME)
        addParentType(classMap, VISUALIZER)

        addParentType(classMap, MATERIAL_PROPERTY)
        /*
        addParentType(classMap, POSITION_PROPERTY)
        addParentType(classMap, PROPERTY) {
            when {
                it == MATERIAL_PROPERTY -> true
                it == POSITION_PROPERTY -> true
                it.endsWith(MATERIAL_PROPERTY) -> false
                it.endsWith(POSITION_PROPERTY) -> false
                else -> it.endsWith(PROPERTY)
            }
        }
        */

        addParentType(classMap, "TileDiscardPolicy") {
            "Tile" in it && "Discard" in it && "Policy" in it
        }

        addParentType(classMap, "StyleExpression") {
            it.endsWith("Expression")
        }
    }

    // TODO: remove temp hack
    declarations.removeAll {
        it.name == "DictionaryLike" || it.name == "HilbertOrder" || it.name == "ImagerySplitDirection"
    }

    declarations.removeAll {
        it.name == "cancelAnimationFrame"
                || it.name == "requestAnimationFrame"
                || it.name == "requestAnimationFrameCallback"
                || it.name == "defaultValue"
                || it.name == "defined<Type>"
    }

    declarations.removeAll {
        it is Interface && classMap.containsKey(it.name)
    }

    val interfaceMap = declarations.asSequence()
        .filterIsInstance<Interface>()
        .associateBy { it.name }

    declarations.removeAll {
        when {
            it !is Namespace -> false

            classMap.containsKey(it.name) -> {
                classMap.getValue(it.name).companion = it
                true
            }

            interfaceMap.containsKey(it.name) -> {
                interfaceMap.getValue(it.name).companion = it
                true
            }

            else -> false
        }
    }

    return declarations
}

private fun addParentType(
    classMap: Map<String, Class>,
    parentType: String,
    filter: (String) -> Boolean = { it.endsWith(parentType) },
) {
    val abstractMembers = classMap.getValue(parentType)
        .overridableMembers()
        .map { it.name }
        .toSet()

    classMap.keys
        .asSequence()
        .filter { filter(it) && it != parentType }
        .map(classMap::getValue)
        .onEach { it.parents += parentType }
        .flatMap { it.overridableMembers() }
        .filter { it.name in abstractMembers }
        .forEach { it.overridden = true }
}

private fun Class.overridableMembers(): Sequence<Member> =
    members.asSequence()
        .filter { !it.static }
        .filter { it is Property || it is Method }

private fun readDeclarations(
    definitionsFile: File,
): List<Declaration> =
    definitionsFile.readText()
        .substringAfter("""declare module "@cesium/engine" {""")
        .substringAfter("""declare module "@cesium/widgets" {""")
        .substringBefore("\n\n\n}")
        .substringBefore("\n\n\n\n\n  /**")
        .replace("($TS_FUNCTION)", JS_FUNCTION)
        .replace(TS_FUNCTION, JS_FUNCTION)
        .replace("* /**", "*")
        .replace("[webAssemblyOptions", "[options")
        .replace("(webAssemblyOptions", "(options")
        .replace("The DOM element or ID", "The DOM element")
        .replace("<ImageryLayer.ErrorEventCallback>", "<ImageryLayerErrorEventCallback>")
        .replace("<ImageryLayer.ReadyEventCallback>", "<ImageryLayerReadyEventCallback>")
        .replace("type ErrorEventCallback = (this: ImageryLayer, ", "type ImageryLayerErrorEventCallback = (")
        .replace("type ReadyEventCallback = (this: ImageryLayer, ", "type ImageryLayerReadyEventCallback = (")
        .replace("<Terrain.ErrorEventCallback>", "<TerrainErrorEventCallback>")
        .replace("<Terrain.ReadyEventCallback>", "<TerrainReadyEventCallback>")
        .replace("type ErrorEventCallback = (this: Terrain, ", "type TerrainErrorEventCallback = (")
        .replace("type ReadyEventCallback = (this: Terrain, ", "type TerrainReadyEventCallback = (")
        .replace("this: TerrainProvider, ", "")
        .replace(
            "export function PickId(pickObjects: Map<number, object>, key: number, color: Color): void;",
            """|/**
                          |  * TODO: Missing description
                          |  */
                          |export function PickId(pickObjects: Map<number_object>, key: number, color: Color): void;
                        """.trimMargin(),
        )
        .replace(
            "interpolateHeight(rectangle: Rectangle, longitude: number, latitude: number): number | undefined;",
            "interpolateHeight(rectangle: Rectangle, longitude: number, latitude: number): number;"
        )
        .replace("credits: Credit[] | undefined;", "credits: Credit[];")
        // For version `1.103.0`
        .replace(" readonly targetPropertyNames: any;", " readonly targetPropertyNames: string[];")
        .replace("};\n    type UpdaterFunction ", "};\n    /**\n     * Function\n     */\n    type UpdaterFunction ")
        .replace(RECORD) { record(it.groupValues[1]) }
        .applyTypeAliasCorrection()
        .let { "\n$it" }
        .splitToSequence("\n\n/**")
        .filter { it.isNotBlank() }
        .map { "/**$it" }
        .flatMap { it.split("\n\nexport ").asSequence() }
        .flatMap { parseTopDefinition(it) }
        // TODO: support
        .filter { !it.body.startsWith("export var ") }
        .filter { !it.body.startsWith("var ") }
        // TODO: support
        .filter { !it.body.startsWith("export const ") || it.body.startsWith("export const enum ") }
        .filter { !it.body.startsWith("const ") || it.body.startsWith("const enum ") }
        .map { source ->
            val body = source.body
            val prefix = FACTORY_MAP.keys
                .first { body.startsWith(it) }

            val newSource = source.copy(body = body.removePrefix(prefix))
            FACTORY_MAP.getValue(prefix)(newSource)
        }
        .toList()

private fun record(valueType: String): String {
    return "Record<String, ${kotlinType(valueType)}>"
}

private fun String.applyTypeAliasCorrection(): String =
    replace("Geocoder.DestinationFoundFunction", "DestinationFoundFunction")
        .replace("TimeInterval.DataComparer", "DataComparer")
        .replace("TimeInterval.MergeCallback", "MergeCallback")
        .replace("EasingFunction.Callback", "EasingCallback")
        .replace("CallbackProperty.Callback", "CallbackPropertyCallback")
        .replace("CallbackPositionProperty.Callback", "CallbackPositionProperty")
