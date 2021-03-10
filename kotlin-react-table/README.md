## kotlin-react-table

Kotlin wrappers for [React Table](https://github.com/tannerlinsley/react-table) library.

### Maven

```xml
<project>
    <repositories>
        <repository>
            <id>space-kotlin-js-wrappers</id>
            <url>https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers</url>
        </repository>
    </repositories>
    
    <dependency>
        <groupId>org.jetbrains</groupId>
        <artifactId>kotlin-react-table</artifactId>
        <version>VERSION</version>
    </dependency>
</project>
```

### Gradle

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    }
}

implementation("org.jetbrains:kotlin-react-table:VERSION")
```

### Supported hooks
* [`useTable`](https://react-table.tanstack.com/docs/api/useTable)
* [`useGroupBy`](https://react-table.tanstack.com/docs/api/useGroupBy)
* [`useExpanded`](https://react-table.tanstack.com/docs/api/useExpanded)
* [`usePagination`](https://react-table.tanstack.com/docs/api/usePagination)
* [`useSortBy`](https://react-table.tanstack.com/docs/api/useSortBy)
* [`useColumnOrder`](https://react-table.tanstack.com/docs/api/useColumnOrder)
* [`useRowSelect`](https://react-table.tanstack.com/docs/api/useRowSelect)
* [`useRowState`](https://react-table.tanstack.com/docs/api/useRowState)
