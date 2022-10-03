package react.select

external interface FormatOptionLabelMeta<Option> {
    var context: FormatOptionLabelContext
    var inputValue: String
    var selectValue: Options<Option>
}
