package react.select

external interface Accessors<Option> {
    var getOptionValue: GetOptionValue<Option>
    var getOptionLabel: GetOptionLabel<Option>
}
