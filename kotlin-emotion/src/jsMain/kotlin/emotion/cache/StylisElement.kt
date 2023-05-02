package emotion.cache

sealed external interface StylisElement {
    val type: String
    val value: String
    val props: Any /* Array<String> | String */
    val root: StylisElement?
    val parent: StylisElement?
    val children: Any /* Array<StylisElement> | String */
    val line: Int
    val column: Int
    val length: Int
    val `return`: String
}
