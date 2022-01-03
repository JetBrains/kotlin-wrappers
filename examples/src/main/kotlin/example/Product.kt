package example

import csstype.Color
import react.FC
import react.Props
import react.PropsWithChildren
import react.css.css
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.dom.html.ReactHTML.table
import react.dom.html.ReactHTML.tbody
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.th
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import react.useState

/**
 * A thinking-in-react implementation by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 * This is a port of https://reactjs.org/docs/thinking-in-react.html
 *
 * Date: Nov 24, 2017
 */

val RawProductCategory = FC<PropsWithChildren> {
    tr {
        th {
            colSpan = 2

            children()
        }
    }
}

external interface RawProductProps : Props {
    var name: String
    var price: Double
    var isStocked: Boolean?
}

val RawProduct = FC<RawProductProps> { props ->
    tr {
        td {
            if (props.isStocked!!) {
                +props.name
            } else {
                span {
                    css {
                        color = Color("red")
                    }
                    +props.name
                }
            }
        }
        td {
            +"$${props.price}"
        }
    }
}

external interface ProductTableProps : Props {
    var products: Array<Product>
    var filterText: String
    var inStockOnly: Boolean?
}

val ProductTable = FC<ProductTableProps> { props ->
    var lastCategory = ""

    table {
        thead {
            tr {
                th {
                    +"Name"
                }
                th {
                    +"Price"
                }
            }
        }
        tbody {
            PRODUCTS.forEach {
                //show the category name
                if (it.category != lastCategory) {
                    RawProductCategory {
                        +it.category
                    }
                }
                lastCategory = it.category

                //show the product per filter text and inStock flag
                if (!((props.filterText.isNotEmpty() && !it.name.uppercase().contains(props.filterText.uppercase())) || (props.inStockOnly!! && !it.isStocked))) {
                    RawProduct {
                        name = it.name
                        price = it.price
                        isStocked = it.isStocked
                    }
                }
            }
        }
    }
}

external interface SearchBarProps : Props {
    var onClick: () -> Unit
    var onChange: (String) -> Unit
    var inStockOnly: Boolean?
    var filterText: String
}

val SearchBar = FC<SearchBarProps> { props ->
    div {
        input {
            type = InputType.text
            name = "filterText"
            value = props.filterText
            placeholder = "Search products"
            onChange = { props.onChange(it.target.value) }
        }
        p {
            input {
                type = InputType.checkbox
                name = "showInstockOnly"
                value = if (props.inStockOnly!!) "1" else "0"
                onClick = { props.onClick() }
            }
            +"Show in-stock products only"
        }
    }
}

external interface ProductProps : Props

data class Product(
    val category: String,
    val price: Double,
    val isStocked: Boolean,
    val name: String,
)

val PRODUCTS = arrayOf(
    Product("Sporting Goods", 49.9, true, "Football"),
    Product("Sporting Goods", 9.9, true, "Baseball"),
    Product("Sporting Goods", 29.9, false, "Basketball"),
    Product("Electronics", 99.9, true, "iPod Touch"),
    Product("Electronics", 999.9, false, "iPhone X"),
    Product("Electronics", 199.9, true, "Nexus"),
)

val ProductComponent = FC<ProductProps> {
    var filterText by useState("")
    var inStockOnly by useState(false)

    fun handleFilterInputChange(targetValue: String) {
        filterText = targetValue
    }

    fun handleInStockInputClick() {
        inStockOnly = !inStockOnly
    }

    div {
        SearchBar {
            this.onClick = { handleInStockInputClick() }
            this.onChange = { filterText: String -> handleFilterInputChange(filterText) }
            this.inStockOnly = inStockOnly
            this.filterText = filterText
        }

        ProductTable {
            this.products = PRODUCTS
            this.filterText = filterText
            this.inStockOnly = inStockOnly
        }
    }
}

val ProductApp = FC<Props> {
    ProductComponent()
}
