package ajv

import js.objects.JsPlainObject

@JsPlainObject
external interface Options {
    val strict: Boolean?
    val strictSchema: Boolean?
    val strictNumbers: Boolean?
    val strictTypes: Boolean?
    val strictTuples: Boolean?
    val strictRequired: Boolean?
    val allowMatchingProperties: Boolean?
    val allowUnionTypes: Boolean?
    val validateFormats: Boolean?
    val `$data`: Boolean?
    val allErrors: Boolean?
    val verbose: Boolean?
    val discriminator: Boolean?
    val unicodeRegExp: Boolean?
    var timestamp: OptionsTimestamp?
    val parseDate: Boolean?
    val allowDate: Boolean?
    val removeAdditional: Boolean?
    val useDefaults: Boolean?
    val coerceTypes: Boolean?
    val next: Boolean?
    val unevaluated: Boolean?
    val dynamicRef: Boolean?
    val schemaId: OptionsSchemaId?
    val jtd: Boolean?
    val validateSchema: Boolean?
    val addUsedSchema: Boolean?
    val inlineRefs: Boolean?
    val passContext: Boolean?
    val loopRequired: Double?
    val loopEnum: Double?
    val ownProperties: Boolean?
    val multipleOfPrecision: Double?
    val int32range: Boolean?
    val messages: Boolean?
}
