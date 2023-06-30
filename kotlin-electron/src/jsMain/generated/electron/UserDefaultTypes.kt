package electron


external interface UserDefaultTypes {
    // Docs: https://electronjs.org/docs/api/structures/user-default-types
    var array: Array<Any?>
    var boolean: Boolean
    var dictionary: js.core.ReadonlyRecord<String, Any>
    var double: Double
    var float: Double
    var integer: Double
    var string: String
    var url: String
}
