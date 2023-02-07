// Automatically generated - do not modify!

package tanstack.table.core

external interface TableFeature {
    var getDefaultOptions: ((table: Any) -> Any)?
    var getInitialState: ((initialState: InitialTableState?) -> Any)?
    var createTable: ((table: Any) -> Any)?
    var getDefaultColumnDef: (() -> Any)?
    var createColumn: ((column: Any, table: Any) -> Any)?
    var createHeader: ((column: Any, table: Any) -> Any)?
    var createCell: ((cell: Any, column: Any, row: Any, table: Any) -> Any)?
    var createRow: ((row: Any, table: Any) -> Any)?
}
