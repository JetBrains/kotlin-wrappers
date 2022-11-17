plugins {
    `java-platform`
    `publish-conventions`
}

dependencies {
    constraints {
        api(project(":kotlin-browser"))
        api(project(":kotlin-cesium"))
        api(project(":kotlin-css"))
        api(project(":kotlin-csstype"))
        api(project(":kotlin-emotion"))
        api(project(":kotlin-extensions"))
        api(project(":kotlin-history"))
        api(project(":kotlin-js"))
        api(project(":kotlin-mui"))
        api(project(":kotlin-mui-icons"))
        api(project(":kotlin-node"))
        api(project(":kotlin-popper"))
        api(project(":kotlin-react"))
        api(project(":kotlin-react-beautiful-dnd"))
        api(project(":kotlin-react-core"))
        api(project(":kotlin-react-dom"))
        api(project(":kotlin-react-dom-legacy"))
        api(project(":kotlin-react-legacy"))
        api(project(":kotlin-react-popper"))
        api(project(":kotlin-react-redux"))
        api(project(":kotlin-react-router-dom"))
        api(project(":kotlin-react-select"))
        api(project(":kotlin-redux"))
        api(project(":kotlin-remix-run-router"))
        api(project(":kotlin-ring-ui"))
        api(project(":kotlin-styled"))
        api(project(":kotlin-styled-next"))
        api(project(":kotlin-tanstack-query-core"))
        api(project(":kotlin-tanstack-react-query"))
        api(project(":kotlin-tanstack-react-query-devtools"))
        api(project(":kotlin-tanstack-react-table"))
        api(project(":kotlin-tanstack-react-virtual"))
        api(project(":kotlin-tanstack-table-core"))
        api(project(":kotlin-tanstack-virtual-core"))
        api(project(":kotlin-typescript"))
        api(project(":kotlin-web"))
    }
}
